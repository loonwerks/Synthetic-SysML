// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Dispatch_Request_Event.scala

Input_Status.scala

Qualified_Request.scala

Product_Availability.scala

Availability_Assessment_Value.scala

Dispatch_Outcome.scala

Qualified_Outcome.scala

Dispatch_Phase.scala

Dispatch_Disposition.scala

Shipment_Release_Command.scala

Dispatch_Status.scala

Shipping_Confirmation.scala

Dispatch_Request_Sample.scala

Product_Availability_Sample.scala

Dispatch_Outcome_Sample.scala

Dispatch_Resolution.scala

Base_Types.scala

Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala

Availability_Assessment_dispatch_coordination_process_availability_assessment_Containers.scala

Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Containers.scala

Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_Containers.scala

Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Containers.scala

Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Containers.scala

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

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_ValueType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_DispositionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Disposition_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_OutcomeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Outcome.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Outcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Outcome_Sample(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_PhaseType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Phase.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Phase_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Request_EventType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Request_Sample(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Request_Sample => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Resolution(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Resolution => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Resolution_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_StatusType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Status.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Status_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInput_StatusType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Input_Status.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInput_Status_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Input_Status_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_AvailabilityType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Availability.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_Availability_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Availability_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_Availability_Sample(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Availability_Sample => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_OutcomeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Outcome.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_Outcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_RequestType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Request.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_Request_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Request_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Release_CommandType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Release_Command.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Release_Command_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipping_ConfirmationType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipping_Confirmation.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipping_Confirmation_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


