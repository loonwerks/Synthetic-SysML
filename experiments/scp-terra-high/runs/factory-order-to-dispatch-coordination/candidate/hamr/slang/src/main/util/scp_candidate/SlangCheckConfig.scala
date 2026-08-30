// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

FreshRequest.scala

MaterialBand.scala

ProductBand.scala

ExecutionOutcome.scala

OutcomeEventClass.scala

OrderState.scala

QualifiedOutcome.scala

RecoveryEvent.scala

RecoveryGate.scala

EmergencyState.scala

RecoveryState.scala

ProposalState.scala

DispatchAction.scala

OrderStatusValue.scala

RecoveryStatusValue.scala

Mode.scala

SelectedCause.scala

PublishedOrderState.scala

PublishedRecoveryState.scala

RequestDisposition.scala

PublishedAction.scala

RequestBoundaryFacts.scala

CapabilitySnapshot.scala

RequestFacts.scala

MaterialBoundaryFacts.scala

InventorySnapshot.scala

ProductBoundaryFacts.scala

StockFacts.scala

OutcomeBoundaryFacts.scala

DispatchStatusRecord.scala

DispatchPublicResult.scala

Base_Types.scala

CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_Containers.scala

InventoryAcquisition_coordinator_process_inventory_acquisition_Containers.scala

CapabilityAcquisition_coordinator_process_capability_acquisition_Containers.scala

ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_Containers.scala

RequestQualification_coordinator_process_request_qualification_Containers.scala

StockAssessment_coordinator_process_stock_assessment_Containers.scala

OutcomeQualification_coordinator_process_outcome_qualification_Containers.scala

RecoveryControl_coordinator_process_recovery_control_Containers.scala

OrderLifecycle_coordinator_process_order_lifecycle_Containers.scala

QuotationEligibility_coordinator_process_quotation_eligibility_Containers.scala

ProcurementEligibility_coordinator_process_procurement_eligibility_Containers.scala

ProductionEligibility_coordinator_process_production_eligibility_Containers.scala

DispatchEligibility_coordinator_process_dispatch_eligibility_Containers.scala

ActionArbitration_coordinator_process_action_arbitration_Containers.scala

StatusDerivation_coordinator_process_status_derivation_Containers.scala

PublicComposition_coordinator_process_public_composition_Containers.scala

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

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilitySnapshot(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilitySnapshot => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchActionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchAction.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchAction_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchAction_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchPublicResult(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchPublicResult => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchPublicResult_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchStatusRecord(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchStatusRecord => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorEmergencyStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.EmergencyState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorEmergencyState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.EmergencyState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcome.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorFreshRequestType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.FreshRequest.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorFreshRequest_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.FreshRequest_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventorySnapshot(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventorySnapshot => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventorySnapshot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.InventorySnapshot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorMaterialBandType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.MaterialBand.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorMaterialBand_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.MaterialBand_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorMaterialBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.MaterialBoundaryFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorModeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Mode.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorMode_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Mode_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderStatusValueType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderStatusValue.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOrderStatusValue_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OrderStatusValue_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeEventClassType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeEventClass.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeEventClass_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductBandType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductBand.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductBand_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductBand_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductBoundaryFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProposalStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProposalState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProposalState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.ProposalState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedActionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedAction.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedAction_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedAction_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedOrderStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedOrderState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedOrderState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedOrderState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedRecoveryStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedRecoveryState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualifiedOutcomeType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QualifiedOutcome.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualifiedOutcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryEventType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryEvent.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryEvent_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryEvent_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryGateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryGate.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryGate_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryGate_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryStateType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryState.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryState_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryState_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryStatusValueType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryStatusValue.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestBoundaryFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestBoundaryFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestDispositionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestDisposition.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestDisposition_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestFacts_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorSelectedCauseType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.SelectedCause.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorSelectedCause_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.SelectedCause_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockFacts(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockFacts => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStockFacts_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.StockFacts_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


