// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Arrival_Sample.scala

Arrival_Fact.scala

Shipment_Result_Sample.scala

Registry_Instruction.scala

Pending_Request_View.scala

Request_Value.scala

Registry_Outcome.scala

Angle_A_Stock_Band.scala

Angle_B_Stock_Band.scala

Input_Status.scala

Inventory_Finding.scala

Dispatch_Readiness.scala

Shipment_Release_Directive.scala

Dispatch_Disposition.scala

Customer_Dispatch_Notice.scala

Active_Slot.scala

Completion_Slot.scala

Dispatch_Candidate.scala

Inventory_Sample.scala

Dispatch_Readiness_Sample.scala

Base_Types.scala

Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala

Request_Registry_dispatch_coordination_process_request_registry_Containers.scala

Inventory_Assessment_dispatch_coordination_process_inventory_assessment_Containers.scala

Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_Containers.scala

Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_Containers.scala

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

@datatype class Config_Factory_Dispatch_CoordinatorActive_SlotType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Active_Slot.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActive_Slot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Active_Slot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAngle_A_Stock_BandType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAngle_B_Stock_BandType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorArrival_FactType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Arrival_Fact.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorArrival_Fact_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Arrival_Fact_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCompletion_SlotType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Completion_Slot.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCompletion_Slot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Completion_Slot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Candidate(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Candidate => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Candidate_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_DispositionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Disposition_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_ReadinessType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Readiness.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Readiness_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Readiness_Sample(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInput_StatusType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Input_Status.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInput_Status_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Input_Status_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_FindingType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Finding.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Finding_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Finding_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Sample(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Sample => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPending_Request_ViewType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Pending_Request_View.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPending_Request_View_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Pending_Request_View_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRegistry_InstructionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Registry_Instruction.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRegistry_Instruction_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Registry_Instruction_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRegistry_OutcomeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Registry_Outcome.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRegistry_Outcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Registry_Outcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Arrival_SampleType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_ValueType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Value.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Value_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Value_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Release_DirectiveType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Result_SampleType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


