// #Sireum

package mining_threat_retreat_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Threat_Value.scala

Threat_Status.scala

Cargo_Band.scala

Cargo_Status.scala

Capacitor_Band.scala

Capacitor_Status.scala

Operator_Request.scala

Request_Status.scala

Mining_Availability.scala

Mining_Availability_Status.scala

Defense_Availability.scala

Defense_Availability_Status.scala

Retreat_Availability.scala

Retreat_Availability_Status.scala

Service_Progress.scala

Service_Progress_Status.scala

Mining_Command.scala

Defense_Command.scala

Movement_Service_Command.scala

Operational_Phase.scala

Input_Fault.scala

Threat_Observation.scala

Cargo_Observation.scala

Capacitor_Observation.scala

Request_Observation.scala

Mining_Availability_Observation.scala

Defense_Availability_Observation.scala

Retreat_Availability_Observation.scala

Service_Progress_Observation.scala

Base_Types.scala

Threat_Qualification_supervisor_process_threat_qualification_Containers.scala

Resource_Qualification_supervisor_process_resource_qualification_Containers.scala

Request_Availability_Qualification_supervisor_process_request_availability_qualification_Containers.scala

Principal_Decision_Owner_supervisor_process_principal_decision_owner_Containers.scala

Mining_Command_Delivery_supervisor_process_mining_command_delivery_Containers.scala

Defense_Command_Delivery_supervisor_process_defense_command_delivery_Containers.scala

Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_Containers.scala

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

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_BandType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_BandType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Band.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_Band_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorCargo_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_AvailabilityType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Availability_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Availability_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Availability_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_CommandType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorInput_FaultType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Input_Fault.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorInput_Fault_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_AvailabilityType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Availability_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Availability_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Availability_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_CommandType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_CommandType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorOperational_PhaseType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorOperational_Phase_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorOperator_RequestType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Operator_Request.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorOperator_Request_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRequest_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Request_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_AvailabilityType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_ProgressType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_Progress_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_Progress_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_Progress_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_StatusType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Status.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Status_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_ValueType(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Value.Type => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Value_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


