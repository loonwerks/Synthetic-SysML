// #Sireum

package eit_image_review_availability_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatchEvent.scala

BatchCategory.scala

GeneratorFeedback.scala

GenerationState.scala

FeedbackCondition.scala

ViewerObservation.scala

ViewerCondition.scala

RecoveryRequest.scala

GeneratorProposal.scala

ProposalCondition.scala

DoctorRequest.scala

ReviewState.scala

WorkflowAction.scala

RequestDisposition.scala

DecisionNotice.scala

GenerationPreStateSnapshot.scala

GenerationDecisionNextState.scala

ReviewPreStateSnapshot.scala

ReviewDecisionNextState.scala

GenerationCommand.scala

ReviewAvailability.scala

WorkflowStatusGenerationState.scala

WorkflowStatusReviewState.scala

WorkflowStatusDisposition.scala

PublicNotice.scala

BatchAssessment.scala

FeedbackAssessment.scala

ViewerAssessment.scala

GeneratorProposalRecord.scala

WorkflowDecision.scala

GenerationDecisionSnapshot.scala

ReviewDecisionSnapshot.scala

WorkflowStatus.scala

Base_Types.scala

BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_Containers.scala

GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_Containers.scala

ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_Containers.scala

GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_Containers.scala

AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_Containers.scala

GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_Containers.scala

ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_Containers.scala

GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_Containers.scala

AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_Containers.scala

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

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchAssessment(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchAssessment => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchCategoryType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchCategory.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchEventType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchEvent.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorDecisionNoticeType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorDoctorRequestType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorFeedbackAssessment(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorFeedbackConditionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGenerationState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorProposalType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorProposalConditionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorPublicNoticeType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.PublicNotice.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorRecoveryRequestType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorRequestDispositionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_DataTypeId.Type], filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorReviewState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerAssessment(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerAssessment => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerConditionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerObservationType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowActionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowDecision(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowDecision => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatus(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatus => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type => B) {}

@datatype class Config_EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(attempts: Z, verbose: B, filter: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


