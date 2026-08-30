// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Id.scala

Product_Id.scala

Dispatch_Amount.scala

Request_Freshness.scala

Admission_Assessment.scala

Inventory_Amount.scala

Observation_Validity.scala

Inventory_Product_Id.scala

Dispatch_Lifecycle.scala

Capacity_Request_Id.scala

Capacity_Product_Id.scala

Capacity_Amount.scala

Fresh_Inventory_Assessment.scala

Recovery_Inventory_Assessment.scala

Candidate_Request_Id.scala

Candidate_Product_Id.scala

Candidate_Amount.scala

Candidate_Lifecycle.scala

Dock_Disposition.scala

Dock_Assessment.scala

Dispatch_Attempt.scala

Outcome_Result.scala

Context_Request_Id.scala

Context_Attempt.scala

Outcome_Plan.scala

Confirmation_Outcome_Class.scala

Confirmation_Request_Id.scala

Selected_Intent.scala

Dispatch_Decision_Kind.scala

Decision_Reason.scala

Instruction_Kind.scala

Confirmation_Kind.scala

Dispatch_Status.scala

Raw_Dispatch_Request.scala

Qualified_Request_Fact.scala

Dispatch_Inventory_Snapshot.scala

Recovery_Qualification_Context.scala

Candidate_Inventory_Readiness.scala

Dock_Snapshot.scala

Execution_Outcome.scala

Active_Execution_Context.scala

Confirmation_Context.scala

Dispatch_Decision.scala

Shipment_Instruction.scala

Shipping_Confirmation.scala

Base_Types.scala

Request_Qualifier_dispatch_coordinator_process_request_qualifier_Containers.scala

Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_Containers.scala

Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_Containers.scala

Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_Containers.scala

Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_Containers.scala

Release_Arbiter_dispatch_coordinator_process_release_arbiter_Containers.scala

Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_Containers.scala

Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_Containers.scala

Status_Determiner_dispatch_coordinator_process_status_determiner_Containers.scala

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

@datatype class Config_Factory_Dispatch_CoordinatorActive_Execution_Context(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Active_Execution_Context => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorActive_Execution_Context_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAdmission_AssessmentType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Admission_Assessment.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorAdmission_Assessment_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Admission_Assessment_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_AmountType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Amount.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Amount_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Amount_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_LifecycleType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Product_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Product_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Request_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Request_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_AmountType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Amount.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_Amount_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Amount_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_Product_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_Request_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Context(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Context => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Context_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Context_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_KindType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Kind.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Kind_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Request_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorContext_AttemptType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Context_Attempt.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorContext_Attempt_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Context_Attempt_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorContext_Request_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Context_Request_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorContext_Request_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Context_Request_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDecision_ReasonType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Decision_Reason.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDecision_Reason_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Decision_Reason_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_AmountType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Amount.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Amount_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_AttemptType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Attempt_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_KindType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_LifecycleType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_StatusType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Status.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDispatch_Status_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_AssessmentType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Assessment.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Assessment_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Assessment_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_DispositionType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Disposition.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Disposition_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Disposition_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Snapshot(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Snapshot => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorDock_Snapshot_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecution_Outcome(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Execution_Outcome => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorExecution_Outcome_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Execution_Outcome_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInstruction_KindType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Instruction_Kind.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInstruction_Kind_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Instruction_Kind_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_AmountType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Amount.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Amount_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Amount_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Product_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Product_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorObservation_ValidityType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Observation_Validity.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorObservation_Validity_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Observation_Validity_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_PlanType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Plan.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Plan_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Plan_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_ResultType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Result.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorOutcome_Result_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Outcome_Result_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorProduct_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Product_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_Request_Fact(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Request_Fact => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRaw_Dispatch_Request(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Raw_Dispatch_Request => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecovery_Qualification_Context(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Recovery_Qualification_Context => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_FreshnessType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Freshness.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Freshness_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Freshness_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_IdType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Id.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Id_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Id_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorSelected_IntentType(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Selected_Intent.Type => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorSelected_Intent_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Selected_Intent_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Instruction(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Instruction => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipment_Instruction_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipping_Confirmation(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipping_Confirmation => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorShipping_Confirmation_Payload(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_DataTypeId.Type], filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => B) {}

@datatype class Config_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


