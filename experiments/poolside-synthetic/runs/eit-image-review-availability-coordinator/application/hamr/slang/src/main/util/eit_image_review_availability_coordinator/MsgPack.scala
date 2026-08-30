// #Sireum
// @formatter:off

// This file is auto-generated from BatchEvent.scala, BatchCategory.scala, GeneratorFeedback.scala, GenerationState.scala, FeedbackCondition.scala, ViewerObservation.scala, ViewerCondition.scala, RecoveryRequest.scala, GeneratorProposal.scala, ProposalCondition.scala, DoctorRequest.scala, ReviewState.scala, WorkflowAction.scala, RequestDisposition.scala, DecisionNotice.scala, GenerationPreStateSnapshot.scala, GenerationDecisionNextState.scala, ReviewPreStateSnapshot.scala, ReviewDecisionNextState.scala, GenerationCommand.scala, ReviewAvailability.scala, WorkflowStatusGenerationState.scala, WorkflowStatusReviewState.scala, WorkflowStatusDisposition.scala, PublicNotice.scala, BatchAssessment.scala, FeedbackAssessment.scala, ViewerAssessment.scala, GeneratorProposalRecord.scala, WorkflowDecision.scala, GenerationDecisionSnapshot.scala, ReviewDecisionSnapshot.scala, WorkflowStatus.scala, Base_Types.scala, BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_Containers.scala, GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_Containers.scala, ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_Containers.scala, GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_Containers.scala, AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_Containers.scala, GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_Containers.scala, ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_Containers.scala, GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_Containers.scala, AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package eit_image_review_availability_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload: Z = -32

    val EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload: Z = -31

    val EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload: Z = -30

    val EIT_Image_Review_Availability_CoordinatorGenerationState_Payload: Z = -29

    val EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload: Z = -28

    val EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload: Z = -27

    val EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload: Z = -26

    val EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload: Z = -25

    val EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload: Z = -24

    val EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload: Z = -23

    val EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload: Z = -22

    val EIT_Image_Review_Availability_CoordinatorReviewState_Payload: Z = -21

    val EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload: Z = -20

    val EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload: Z = -19

    val EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload: Z = -18

    val EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload: Z = -17

    val EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload: Z = -16

    val EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload: Z = -15

    val EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload: Z = -14

    val EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload: Z = -13

    val EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload: Z = -12

    val EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload: Z = -11

    val EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload: Z = -10

    val EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload: Z = -9

    val EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload: Z = -8

    val EIT_Image_Review_Availability_CoordinatorBatchAssessment: Z = -7

    val EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload: Z = -6

    val EIT_Image_Review_Availability_CoordinatorFeedbackAssessment: Z = -5

    val EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload: Z = -4

    val EIT_Image_Review_Availability_CoordinatorViewerAssessment: Z = -3

    val EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload: Z = -2

    val EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord: Z = -1

    val EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload: Z = 0

    val EIT_Image_Review_Availability_CoordinatorWorkflowDecision: Z = 1

    val EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload: Z = 2

    val EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot: Z = 3

    val EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload: Z = 4

    val EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot: Z = 5

    val EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload: Z = 6

    val EIT_Image_Review_Availability_CoordinatorWorkflowStatus: Z = 7

    val EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload: Z = 8

    val Base_TypesBoolean_Payload: Z = 9

    val Base_TypesInteger_Payload: Z = 10

    val Base_TypesInteger_8_Payload: Z = 11

    val Base_TypesInteger_16_Payload: Z = 12

    val Base_TypesInteger_32_Payload: Z = 13

    val Base_TypesInteger_64_Payload: Z = 14

    val Base_TypesUnsigned_8_Payload: Z = 15

    val Base_TypesUnsigned_16_Payload: Z = 16

    val Base_TypesUnsigned_32_Payload: Z = 17

    val Base_TypesUnsigned_64_Payload: Z = 18

    val Base_TypesFloat_Payload: Z = 19

    val Base_TypesFloat_32_Payload: Z = 20

    val Base_TypesFloat_64_Payload: Z = 21

    val Base_TypesCharacter_Payload: Z = 22

    val Base_TypesString_Payload: Z = 23

    val Base_TypesBits_Payload: Z = 24

    val EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P: Z = 25

    val EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS: Z = 26

    val EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P: Z = 27

    val EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS: Z = 28

    val EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P: Z = 29

    val EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS: Z = 30

    val EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P: Z = 31

    val EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS: Z = 32

    val EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P: Z = 33

    val EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS: Z = 34

    val EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P: Z = 35

    val EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS: Z = 36

    val EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P: Z = 37

    val EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS: Z = 38

    val EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P: Z = 39

    val EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS: Z = 40

    val EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P: Z = 41

    val EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS: Z = 42

    val EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P: Z = 43

    val EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS: Z = 44

    val EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P: Z = 45

    val EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS: Z = 46

    val EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P: Z = 47

    val EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS: Z = 48

    val EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P: Z = 49

    val EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS: Z = 50

    val EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P: Z = 51

    val EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS: Z = 52

    val EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P: Z = 53

    val EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS: Z = 54

    val EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P: Z = 55

    val EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS: Z = 56

    val EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P: Z = 57

    val EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS: Z = 58

    val EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P: Z = 59

    val EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS: Z = 60

    val utilEmptyContainer: Z = 61

    val _artEmpty: Z = 62

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Image_Review_Availability_CoordinatorBatchEventType(o: EIT_Image_Review_Availability_Coordinator.BatchEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload)
      writeEIT_Image_Review_Availability_CoordinatorBatchEventType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o: EIT_Image_Review_Availability_Coordinator.BatchCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload)
      writeEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o: EIT_Image_Review_Availability_Coordinator.GenerationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerObservationType(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload)
      writeEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerConditionType(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload)
      writeEIT_Image_Review_Availability_CoordinatorViewerConditionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload)
      writeEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorProposalConditionType(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload)
      writeEIT_Image_Review_Availability_CoordinatorProposalConditionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload)
      writeEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o: EIT_Image_Review_Availability_Coordinator.ReviewState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload)
      writeEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload)
      writeEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload)
      writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload)
      writeEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o: EIT_Image_Review_Availability_Coordinator.PublicNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload)
      writeEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchAssessment)
      writeEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o.batchCategory)
      writer.writeB(o.usable)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload)
      writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackAssessment)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o.condition)
      writer.writeB(o.matched)
    }

    def writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerAssessment)
      writeEIT_Image_Review_Availability_CoordinatorViewerConditionType(o.condition)
      writer.writeB(o.accessible)
    }

    def writeEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload)
      writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o.proposal)
      writeEIT_Image_Review_Availability_CoordinatorProposalConditionType(o.condition)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowDecision)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.selectedAction)
      writeEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.disposition)
      writeEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.notice)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot)
      writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o.preState)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o.nextState)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.selectedAction)
      writeEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.disposition)
      writeEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.notice)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot)
      writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o.preState)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o.nextState)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.value)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatus)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o.generationState)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o.reviewState)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o.disposition)
      writeEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o.notice)
    }

    def writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.value)
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

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorBatchEventType(o.api_batchEvent)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorBatchEventType(o.api_batchEvent)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.api_generatorFeedback)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.api_generatorFeedback)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.api_viewerObservation)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.api_viewerObservation)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.api_recoveryRequest)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.api_recoveryRequest)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)
      writeEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.api_doctorRequest)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)
      writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)
      writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)
      writeEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.api_doctorRequest)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
      writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)
      writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)
      writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
      writeEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)
      writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)
    }

    def writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)
      writeEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.api_generationCommand)
    }

    def writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.api_generationCommand)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)
      writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container): Unit = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
      }
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P)
      writeEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.api_reviewAvailability)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.api_workflowStatus)
    }

    def writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS)
      writeEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.api_reviewAvailability)
      writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.api_workflowStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
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
        case o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload => writeEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload => writeEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload => writeEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload => writeEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload => writeEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload => writeEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload => writeEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload => writeEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload => writeEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload => writeEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload => writeEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload => writeEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload => writeEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload => writeEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload => writeEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload => writeEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload => writeEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload => writeEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload => writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload => writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload => writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload => writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload => writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload => writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload => writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload => writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload => writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
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

    def readEIT_Image_Review_Availability_CoordinatorBatchEventType(): EIT_Image_Review_Availability_Coordinator.BatchEvent.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.BatchEvent.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorBatchEventType()
      return EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchCategoryType(): EIT_Image_Review_Availability_Coordinator.BatchCategory.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.BatchCategory.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorBatchCategoryType()
      return EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationStateType(): EIT_Image_Review_Availability_Coordinator.GenerationState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GenerationState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      return EIT_Image_Review_Availability_Coordinator.GenerationState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(): EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.FeedbackCondition.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorFeedbackConditionType()
      return EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerObservationType(): EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ViewerObservation.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      return EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerConditionType(): EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ViewerCondition.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorViewerConditionType()
      return EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(): EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.RecoveryRequest.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      return EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(): EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposal.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorProposalConditionType(): EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ProposalCondition.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorProposalConditionType()
      return EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorDoctorRequestType(): EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.DoctorRequest.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      return EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewStateType(): EIT_Image_Review_Availability_Coordinator.ReviewState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ReviewState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewState_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorReviewStateType()
      return EIT_Image_Review_Availability_Coordinator.ReviewState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowActionType(): EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.WorkflowAction.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorRequestDispositionType(): EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.RequestDisposition.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      return EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(): EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.DecisionNotice.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      return EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType()
      return EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType()
      return EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandType(): EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommand.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(): EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.ReviewAvailability.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      return EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorPublicNoticeType(): EIT_Image_Review_Availability_Coordinator.PublicNotice.Type = {
      val r = reader.readZ()
      return EIT_Image_Review_Availability_Coordinator.PublicNotice.byOrdinal(r).get
    }

    def readEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorPublicNoticeType()
      return EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchAssessment(): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchAssessmentT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchAssessment)
      }
      val batchCategory = readEIT_Image_Review_Availability_CoordinatorBatchCategoryType()
      val usable = reader.readB()
      return EIT_Image_Review_Availability_Coordinator.BatchAssessment(batchCategory, usable)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      return EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      val r = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessmentT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackAssessment)
      }
      val condition = readEIT_Image_Review_Availability_CoordinatorFeedbackConditionType()
      val matched = reader.readB()
      return EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(condition, matched)
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      return EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerAssessment(): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      val r = readEIT_Image_Review_Availability_CoordinatorViewerAssessmentT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerAssessment)
      }
      val condition = readEIT_Image_Review_Availability_CoordinatorViewerConditionType()
      val accessible = reader.readB()
      return EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition, accessible)
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecordT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecordT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord)
      }
      val proposal = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalType()
      val condition = readEIT_Image_Review_Availability_CoordinatorProposalConditionType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(proposal, condition)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowDecision(): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowDecisionT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowDecisionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowDecision)
      }
      val selectedAction = readEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      val disposition = readEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      val notice = readEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowDecision(selectedAction, disposition, notice)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshotT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot)
      }
      val preState = readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType()
      val nextState = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType()
      val selectedAction = readEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      val disposition = readEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      val notice = readEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot(preState, nextState, selectedAction, disposition, notice)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshotT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot)
      }
      val preState = readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType()
      val nextState = readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot(preState, nextState)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload(value)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatus(): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatusT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatus)
      }
      val generationState = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType()
      val reviewState = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType()
      val disposition = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType()
      val notice = readEIT_Image_Review_Availability_CoordinatorPublicNoticeType()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatus(generationState, reviewState, disposition, notice)
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload)
      }
      val value = readEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload(value)
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

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P)
      }
      val api_batchEvent = readEIT_Image_Review_Availability_CoordinatorBatchEventType()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(api_batchEvent)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS)
      }
      val api_batchEvent = readEIT_Image_Review_Availability_CoordinatorBatchEventType()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(api_batchEvent)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P)
      }
      val api_batchAssessment = readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(api_batchAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS)
      }
      val api_batchAssessment = readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(api_batchAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P)
      }
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_generatorFeedback = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(api_generationPreState, api_generatorFeedback)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS)
      }
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_generatorFeedback = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(api_generationPreState, api_generatorFeedback)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P)
      }
      val api_feedbackAssessment = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(api_feedbackAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS)
      }
      val api_feedbackAssessment = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(api_feedbackAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P)
      }
      val api_viewerObservation = readEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(api_viewerObservation)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS)
      }
      val api_viewerObservation = readEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(api_viewerObservation)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P)
      }
      val api_viewerAssessment = readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(api_viewerAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS)
      }
      val api_viewerAssessment = readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(api_viewerAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P)
      }
      val api_feedbackAssessment = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_recoveryRequest = readEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(api_feedbackAssessment, api_generationPreState, api_recoveryRequest)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS)
      }
      val api_feedbackAssessment = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_recoveryRequest = readEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(api_feedbackAssessment, api_generationPreState, api_recoveryRequest)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P)
      }
      val api_generatorProposal = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(api_generatorProposal)
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS)
      }
      val api_generatorProposal = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(api_generatorProposal)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P)
      }
      val api_batchAssessment = readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      val api_doctorRequest = readEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_generatorProposal = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      val api_reviewPreState = readEIT_Image_Review_Availability_CoordinatorReviewStateType()
      val api_viewerAssessment = readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(api_batchAssessment, api_doctorRequest, api_generationPreState, api_generatorProposal, api_reviewPreState, api_viewerAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS)
      }
      val api_batchAssessment = readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      val api_doctorRequest = readEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      val api_generatorProposal = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      val api_reviewPreState = readEIT_Image_Review_Availability_CoordinatorReviewStateType()
      val api_viewerAssessment = readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(api_batchAssessment, api_doctorRequest, api_generationPreState, api_generatorProposal, api_reviewPreState, api_viewerAssessment)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(api_generationDecision, api_generationPreState)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      val api_generationPreState = readEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(api_generationDecision, api_generationPreState)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS)
      }
      val api_workflowDecision = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(api_workflowDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P)
      }
      val api_reviewDecision = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      val api_reviewPreState = readEIT_Image_Review_Availability_CoordinatorReviewStateType()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(api_reviewDecision, api_reviewPreState)
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS)
      }
      val api_reviewDecision = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      val api_reviewPreState = readEIT_Image_Review_Availability_CoordinatorReviewStateType()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(api_reviewDecision, api_reviewPreState)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(api_generationDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(api_generationDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P)
      }
      val api_generationCommand = readEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(api_generationCommand)
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS)
      }
      val api_generationCommand = readEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(api_generationCommand)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      val api_reviewDecision = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(api_generationDecision, api_reviewDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS)
      }
      val api_generationDecision = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      val api_reviewDecision = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(api_generationDecision, api_reviewDecision)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P)
      }
      val api_reviewAvailability = readEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      val api_workflowStatus = readEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(api_reviewAvailability, api_workflowStatus)
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(F)
      return r
    }

    def readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS)
      }
      val api_reviewAvailability = readEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      val api_workflowStatus = readEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(api_reviewAvailability, api_workflowStatus)
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
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T)
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
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchEvent_Payload => val r = readEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorPublicNotice_Payload => val r = readEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchCategory_Payload => val r = readEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload => val r = readEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload => val r = readEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload => val r = readEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorViewerCondition_Payload => val r = readEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload => val r = readEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload => val r = readEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload => val r = readEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorViewerObservation_Payload => val r = readEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorProposalCondition_Payload => val r = readEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload => val r = readEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload => val r = readEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload => val r = readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload => val r = readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload => val r = readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload => val r = readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T)
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

  def fromEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchAssessment(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchAssessment(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchAssessment(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchAssessment, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchAssessment(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(reader: Reader): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerAssessment(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorViewerAssessment(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerAssessment(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ViewerAssessment, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerAssessment(reader: Reader): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorViewerAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowDecision(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowDecision, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowDecision(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowDecision _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatus(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatus, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatus(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowStatus _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(reader: Reader): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload _)
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

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(reader: Reader): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      val r = reader.readEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS _)
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