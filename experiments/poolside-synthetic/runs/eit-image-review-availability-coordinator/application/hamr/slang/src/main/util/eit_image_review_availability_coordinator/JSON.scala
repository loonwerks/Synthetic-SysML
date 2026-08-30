// #Sireum
// @formatter:off

// This file is auto-generated from BatchEvent.scala, BatchCategory.scala, GeneratorFeedback.scala, GenerationState.scala, FeedbackCondition.scala, ViewerObservation.scala, ViewerCondition.scala, RecoveryRequest.scala, GeneratorProposal.scala, ProposalCondition.scala, DoctorRequest.scala, ReviewState.scala, WorkflowAction.scala, RequestDisposition.scala, DecisionNotice.scala, GenerationPreStateSnapshot.scala, GenerationDecisionNextState.scala, ReviewPreStateSnapshot.scala, ReviewDecisionNextState.scala, GenerationCommand.scala, ReviewAvailability.scala, WorkflowStatusGenerationState.scala, WorkflowStatusReviewState.scala, WorkflowStatusDisposition.scala, PublicNotice.scala, BatchAssessment.scala, FeedbackAssessment.scala, ViewerAssessment.scala, GeneratorProposalRecord.scala, WorkflowDecision.scala, GenerationDecisionSnapshot.scala, ReviewDecisionSnapshot.scala, WorkflowStatus.scala, Base_Types.scala, BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_Containers.scala, GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_Containers.scala, ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_Containers.scala, GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_Containers.scala, AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_Containers.scala, GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_Containers.scala, ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_Containers.scala, GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_Containers.scala, AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package eit_image_review_availability_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchEventType(o: EIT_Image_Review_Availability_Coordinator.BatchEvent.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.BatchEvent.NO_BATCH_EVENT => "NO_BATCH_EVENT"
        case EIT_Image_Review_Availability_Coordinator.BatchEvent.INVALID_BATCH_EVENT => "INVALID_BATCH_EVENT"
        case EIT_Image_Review_Availability_Coordinator.BatchEvent.BATCH_A_AVAILABLE => "BATCH_A_AVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.BatchEvent.BATCH_B_AVAILABLE => "BATCH_B_AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.BatchEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorBatchEventType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o: EIT_Image_Review_Availability_Coordinator.BatchCategory.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.NO_BATCH => "NO_BATCH"
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.INVALID_BATCH => "INVALID_BATCH"
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_A => "USABLE_BATCH_A"
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_B => "USABLE_BATCH_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.BatchCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.NO_GENERATOR_FEEDBACK => "NO_GENERATOR_FEEDBACK"
        case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.GENERATION_FAILED => "GENERATION_FAILED"
        case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.IMAGE_A_GENERATED => "IMAGE_A_GENERATED"
        case EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.IMAGE_B_GENERATED => "IMAGE_B_GENERATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GeneratorFeedback")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o: EIT_Image_Review_Availability_Coordinator.GenerationState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY => "GENERATION_EMPTY"
        case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_A => "GENERATING_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_B => "GENERATING_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A => "IMAGE_READY_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B => "IMAGE_READY_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_BLOCKED => "GENERATION_BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GenerationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.NO_RESULT => "NO_RESULT"
        case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_A => "MATCHED_IMAGE_A"
        case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.MATCHED_IMAGE_B => "MATCHED_IMAGE_B"
        case EIT_Image_Review_Availability_Coordinator.FeedbackCondition.FEEDBACK_FAULT => "FEEDBACK_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.FeedbackCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerObservationType(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ViewerObservation.VIEWER_OBSERVATION_INVALID => "VIEWER_OBSERVATION_INVALID"
        case EIT_Image_Review_Availability_Coordinator.ViewerObservation.VIEWER_UNAVAILABLE => "VIEWER_UNAVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.ViewerObservation.VIEWER_AVAILABLE => "VIEWER_AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ViewerObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerConditionType(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_UNAVAILABLE => "REVIEW_ACCESS_UNAVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_AVAILABLE => "REVIEW_ACCESS_AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ViewerCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorViewerConditionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.RecoveryRequest.NO_RECOVERY_REQUEST => "NO_RECOVERY_REQUEST"
        case EIT_Image_Review_Availability_Coordinator.RecoveryRequest.RESET_GENERATION_WORKFLOW => "RESET_GENERATION_WORKFLOW"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.RecoveryRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.NO_GENERATOR_PROPOSAL => "NO_GENERATOR_PROPOSAL"
        case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.BLOCK_GENERATION => "BLOCK_GENERATION"
        case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_A => "ACCEPT_IMAGE_A"
        case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_B => "ACCEPT_IMAGE_B"
        case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.CLEAR_GENERATION_BLOCK => "CLEAR_GENERATION_BLOCK"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GeneratorProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorProposalConditionType(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ProposalCondition.NO_PROPOSAL_CONDITION => "NO_PROPOSAL_CONDITION"
        case EIT_Image_Review_Availability_Coordinator.ProposalCondition.MATCHED_COMPLETION => "MATCHED_COMPLETION"
        case EIT_Image_Review_Availability_Coordinator.ProposalCondition.FEEDBACK_REJECTED => "FEEDBACK_REJECTED"
        case EIT_Image_Review_Availability_Coordinator.ProposalCondition.RESET_APPLICABLE => "RESET_APPLICABLE"
        case EIT_Image_Review_Availability_Coordinator.ProposalCondition.RESET_INAPPLICABLE => "RESET_INAPPLICABLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ProposalCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorProposalConditionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.DoctorRequest.NO_DOCTOR_REQUEST => "NO_DOCTOR_REQUEST"
        case EIT_Image_Review_Availability_Coordinator.DoctorRequest.OPEN_AVAILABLE_IMAGE => "OPEN_AVAILABLE_IMAGE"
        case EIT_Image_Review_Availability_Coordinator.DoctorRequest.CLOSE_REVIEW => "CLOSE_REVIEW"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.DoctorRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewStateType(o: EIT_Image_Review_Availability_Coordinator.ReviewState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED => "REVIEW_CLOSED"
        case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_A => "REVIEWING_A"
        case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_B => "REVIEWING_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ReviewState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorReviewStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION => "NO_WORKFLOW_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.BLOCK_ACTION => "BLOCK_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_A_ACTION => "ACCEPT_IMAGE_A_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_B_ACTION => "ACCEPT_IMAGE_B_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLEAR_BLOCK_ACTION => "CLEAR_BLOCK_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_A_ACTION => "START_BATCH_A_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_B_ACTION => "START_BATCH_B_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_A_ACTION => "OPEN_IMAGE_A_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_B_ACTION => "OPEN_IMAGE_B_ACTION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLOSE_REVIEW_ACTION => "CLOSE_REVIEW_ACTION"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.WorkflowAction")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.RequestDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED => "REJECTED"
        case EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED => "PREEMPTED"
        case EIT_Image_Review_Availability_Coordinator.RequestDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_DECISION_NOTICE => "NO_DECISION_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.INVALID_BATCH_NOTICE => "INVALID_BATCH_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.GENERATOR_BUSY_NOTICE => "GENERATOR_BUSY_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.FEEDBACK_FAULT_NOTICE => "FEEDBACK_FAULT_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_REJECTED_NOTICE => "RESET_REJECTED_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_CLEARED_NOTICE => "RESET_CLEARED_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.VIEWER_UNAVAILABLE_NOTICE => "VIEWER_UNAVAILABLE_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_IMAGE_READY_NOTICE => "NO_IMAGE_READY_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_REPLACED_NOTICE => "IMAGE_REPLACED_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_OPENED_NOTICE => "IMAGE_OPENED_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_CLOSED_NOTICE => "IMAGE_CLOSED_NOTICE"
        case EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE => "REQUEST_PREEMPTED_NOTICE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.DecisionNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATION_EMPTY => "GENERATION_EMPTY"
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATING_A => "GENERATING_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATING_B => "GENERATING_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.IMAGE_READY_A => "IMAGE_READY_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.IMAGE_READY_B => "IMAGE_READY_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATION_BLOCKED => "GENERATION_BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATION_EMPTY => "GENERATION_EMPTY"
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_A => "GENERATING_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_B => "GENERATING_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_A => "IMAGE_READY_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_B => "IMAGE_READY_B"
        case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATION_BLOCKED => "GENERATION_BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEW_CLOSED => "REVIEW_CLOSED"
        case EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEWING_A => "REVIEWING_A"
        case EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEWING_B => "REVIEWING_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEW_CLOSED => "REVIEW_CLOSED"
        case EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_A => "REVIEWING_A"
        case EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_B => "REVIEWING_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.GenerationCommand.NO_GENERATION_COMMAND => "NO_GENERATION_COMMAND"
        case EIT_Image_Review_Availability_Coordinator.GenerationCommand.GENERATE_FROM_BATCH_A => "GENERATE_FROM_BATCH_A"
        case EIT_Image_Review_Availability_Coordinator.GenerationCommand.GENERATE_FROM_BATCH_B => "GENERATE_FROM_BATCH_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.GenerationCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.ReviewAvailability.NO_IMAGE_AVAILABLE => "NO_IMAGE_AVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.ReviewAvailability.IMAGE_A_AVAILABLE_FOR_REVIEW => "IMAGE_A_AVAILABLE_FOR_REVIEW"
        case EIT_Image_Review_Availability_Coordinator.ReviewAvailability.IMAGE_B_AVAILABLE_FOR_REVIEW => "IMAGE_B_AVAILABLE_FOR_REVIEW"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.ReviewAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATION_EMPTY => "GENERATION_EMPTY"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_A => "GENERATING_A"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_B => "GENERATING_B"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_A => "IMAGE_READY_A"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_B => "IMAGE_READY_B"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATION_BLOCKED => "GENERATION_BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEW_CLOSED => "REVIEW_CLOSED"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEWING_A => "REVIEWING_A"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEWING_B => "REVIEWING_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.REJECTED => "REJECTED"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.PREEMPTED => "PREEMPTED"
        case EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o: EIT_Image_Review_Availability_Coordinator.PublicNotice.Type): ST = {
      val value: String = o match {
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.NONE => "NONE"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.WAITING_FOR_GENERATOR => "WAITING_FOR_GENERATOR"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_READY => "IMAGE_READY"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_AVAILABLE => "IMAGE_AVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.INVALID_BATCH => "INVALID_BATCH"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.GENERATOR_BUSY => "GENERATOR_BUSY"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.FEEDBACK_FAULT => "FEEDBACK_FAULT"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.RESET_REJECTED => "RESET_REJECTED"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.RESET_CLEARED => "RESET_CLEARED"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.VIEWER_UNAVAILABLE => "VIEWER_UNAVAILABLE"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.NO_IMAGE_READY => "NO_IMAGE_READY"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_REPLACED => "IMAGE_REPLACED"
        case EIT_Image_Review_Availability_Coordinator.PublicNotice.REQUEST_PREEMPTED => "REQUEST_PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Review_Availability_Coordinator.PublicNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchAssessment""""),
        ("batchCategory", printEIT_Image_Review_Availability_CoordinatorBatchCategoryType(o.batchCategory)),
        ("usable", printB(o.usable))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.FeedbackAssessment""""),
        ("condition", printEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(o.condition)),
        ("matched", printB(o.matched))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ViewerAssessment""""),
        ("condition", printEIT_Image_Review_Availability_CoordinatorViewerConditionType(o.condition)),
        ("accessible", printB(o.accessible))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord""""),
        ("proposal", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(o.proposal)),
        ("condition", printEIT_Image_Review_Availability_CoordinatorProposalConditionType(o.condition))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowDecision""""),
        ("selectedAction", printEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.selectedAction)),
        ("disposition", printEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.disposition)),
        ("notice", printEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.notice))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot""""),
        ("preState", printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(o.preState)),
        ("nextState", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(o.nextState)),
        ("selectedAction", printEIT_Image_Review_Availability_CoordinatorWorkflowActionType(o.selectedAction)),
        ("disposition", printEIT_Image_Review_Availability_CoordinatorRequestDispositionType(o.disposition)),
        ("notice", printEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(o.notice))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot""""),
        ("preState", printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(o.preState)),
        ("nextState", printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(o.nextState))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.value))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowStatus""""),
        ("generationState", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(o.generationState)),
        ("reviewState", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(o.reviewState)),
        ("disposition", printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(o.disposition)),
        ("notice", printEIT_Image_Review_Availability_CoordinatorPublicNoticeType(o.notice))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload""""),
        ("value", printEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P""""),
        ("api_batchEvent", printEIT_Image_Review_Availability_CoordinatorBatchEventType(o.api_batchEvent))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS""""),
        ("api_batchEvent", printEIT_Image_Review_Availability_CoordinatorBatchEventType(o.api_batchEvent))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P""""),
        ("api_batchAssessment", printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS""""),
        ("api_batchAssessment", printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P""""),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_generatorFeedback", printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.api_generatorFeedback))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS""""),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_generatorFeedback", printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(o.api_generatorFeedback))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P""""),
        ("api_feedbackAssessment", printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS""""),
        ("api_feedbackAssessment", printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P""""),
        ("api_viewerObservation", printEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.api_viewerObservation))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS""""),
        ("api_viewerObservation", printEIT_Image_Review_Availability_CoordinatorViewerObservationType(o.api_viewerObservation))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P""""),
        ("api_viewerAssessment", printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS""""),
        ("api_viewerAssessment", printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P""""),
        ("api_feedbackAssessment", printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_recoveryRequest", printEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.api_recoveryRequest))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS""""),
        ("api_feedbackAssessment", printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o.api_feedbackAssessment)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_recoveryRequest", printEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(o.api_recoveryRequest))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P""""),
        ("api_generatorProposal", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS""""),
        ("api_generatorProposal", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P""""),
        ("api_batchAssessment", printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)),
        ("api_doctorRequest", printEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.api_doctorRequest)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_generatorProposal", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)),
        ("api_reviewPreState", printEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)),
        ("api_viewerAssessment", printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS""""),
        ("api_batchAssessment", printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o.api_batchAssessment)),
        ("api_doctorRequest", printEIT_Image_Review_Availability_CoordinatorDoctorRequestType(o.api_doctorRequest)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState)),
        ("api_generatorProposal", printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o.api_generatorProposal)),
        ("api_reviewPreState", printEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState)),
        ("api_viewerAssessment", printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o.api_viewerAssessment))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)),
        ("api_generationPreState", printEIT_Image_Review_Availability_CoordinatorGenerationStateType(o.api_generationPreState))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS""""),
        ("api_workflowDecision", printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o.api_workflowDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P""""),
        ("api_reviewDecision", printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)),
        ("api_reviewPreState", printEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS""""),
        ("api_reviewDecision", printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision)),
        ("api_reviewPreState", printEIT_Image_Review_Availability_CoordinatorReviewStateType(o.api_reviewPreState))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P""""),
        ("api_generationCommand", printEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.api_generationCommand))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS""""),
        ("api_generationCommand", printEIT_Image_Review_Availability_CoordinatorGenerationCommandType(o.api_generationCommand))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)),
        ("api_reviewDecision", printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS""""),
        ("api_generationDecision", printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o.api_generationDecision)),
        ("api_reviewDecision", printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o.api_reviewDecision))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P""""),
        ("api_reviewAvailability", printEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.api_reviewAvailability)),
        ("api_workflowStatus", printEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.api_workflowStatus))
      ))
    }

    @pure def printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS""""),
        ("api_reviewAvailability", printEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(o.api_reviewAvailability)),
        ("api_workflowStatus", printEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o.api_workflowStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_batchQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewAccessQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityWorkflowArbiter_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationSlotStateGovernor_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_reviewSessionStateGovernor_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_generationCommandPolicy_postCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_postInit => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_postInit"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_preCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_preCompute"
        case runtimemonitor.ObservationKind.EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_postCompute => "EITImageReviewAvailabilityCoordinator_Instance_imageReviewCoordinationProcess_availabilityPublicationPolicy_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload => return printEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload => return printEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload => return printEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload => return printEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload => return printEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload => return printEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload => return printEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload => return printEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload => return printEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload => return printEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload => return printEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload => return printEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload => return printEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload => return printEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload => return printEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload => return printEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload => return printEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload => return printEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload => return printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload => return printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload => return printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload => return printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload => return printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload => return printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload => return printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload => return printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload => return printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
        case o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS => return printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchEventType(): EIT_Image_Review_Availability_Coordinator.BatchEvent.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchEventT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchEventT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.BatchEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.BatchEvent.")
          return EIT_Image_Review_Availability_Coordinator.BatchEvent.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorBatchEventType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchCategoryType(): EIT_Image_Review_Availability_Coordinator.BatchCategory.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchCategoryT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchCategoryT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.BatchCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.BatchCategory.")
          return EIT_Image_Review_Availability_Coordinator.BatchCategory.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorBatchCategoryType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedback")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.")
          return EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationStateType(): EIT_Image_Review_Availability_Coordinator.GenerationState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GenerationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GenerationState.")
          return EIT_Image_Review_Availability_Coordinator.GenerationState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackConditionType(): EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackConditionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackConditionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.FeedbackCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.FeedbackCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.FeedbackCondition.")
          return EIT_Image_Review_Availability_Coordinator.FeedbackCondition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorFeedbackConditionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerObservationType(): EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerObservationT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerObservationT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ViewerObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ViewerObservation.")
          return EIT_Image_Review_Availability_Coordinator.ViewerObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerConditionType(): EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerConditionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerConditionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ViewerCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ViewerCondition.")
          return EIT_Image_Review_Availability_Coordinator.ViewerCondition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorViewerConditionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestType(): EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.RecoveryRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.RecoveryRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.RecoveryRequest.")
          return EIT_Image_Review_Availability_Coordinator.RecoveryRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalType(): EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GeneratorProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GeneratorProposal.")
          return EIT_Image_Review_Availability_Coordinator.GeneratorProposal.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorProposalConditionType(): EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorProposalConditionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorProposalConditionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ProposalCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ProposalCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ProposalCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ProposalCondition.")
          return EIT_Image_Review_Availability_Coordinator.ProposalCondition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorProposalConditionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorDoctorRequestType(): EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorDoctorRequestT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorDoctorRequestT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.DoctorRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.DoctorRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.DoctorRequest.")
          return EIT_Image_Review_Availability_Coordinator.DoctorRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewStateType(): EIT_Image_Review_Availability_Coordinator.ReviewState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ReviewState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ReviewState.")
          return EIT_Image_Review_Availability_Coordinator.ReviewState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewState_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowActionType(): EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowActionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowActionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.WorkflowAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.WorkflowAction.")
          return EIT_Image_Review_Availability_Coordinator.WorkflowAction.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorRequestDispositionType(): EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorRequestDispositionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorRequestDispositionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.RequestDisposition.")
          return EIT_Image_Review_Availability_Coordinator.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeType(): EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.DecisionNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.DecisionNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.DecisionNotice.")
          return EIT_Image_Review_Availability_Coordinator.DecisionNotice.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType(): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.")
          return EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.")
          return EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType(): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.")
          return EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.")
          return EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandType(): EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.GenerationCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.GenerationCommand.")
          return EIT_Image_Review_Availability_Coordinator.GenerationCommand.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType(): EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.ReviewAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.ReviewAvailability.")
          return EIT_Image_Review_Availability_Coordinator.ReviewAvailability.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.")
          return EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.")
          return EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.")
          return EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorPublicNoticeType(): EIT_Image_Review_Availability_Coordinator.PublicNotice.Type = {
      val r = parseEIT_Image_Review_Availability_CoordinatorPublicNoticeT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorPublicNoticeT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.PublicNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.PublicNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Review_Availability_Coordinator.PublicNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Review_Availability_Coordinator.PublicNotice.")
          return EIT_Image_Review_Availability_Coordinator.PublicNotice.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorPublicNoticeType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchAssessment(): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchAssessmentT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchAssessment")
      }
      parser.parseObjectKey("batchCategory")
      val batchCategory = parseEIT_Image_Review_Availability_CoordinatorBatchCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchAssessment(batchCategory, usable)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessmentT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.FeedbackAssessment")
      }
      parser.parseObjectKey("condition")
      val condition = parseEIT_Image_Review_Availability_CoordinatorFeedbackConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("matched")
      val matched = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.FeedbackAssessment(condition, matched)
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerAssessment(): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerAssessmentT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerAssessmentT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerAssessment")
      }
      parser.parseObjectKey("condition")
      val condition = parseEIT_Image_Review_Availability_CoordinatorViewerConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("accessible")
      val accessible = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition, accessible)
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecordT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecordT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord")
      }
      parser.parseObjectKey("proposal")
      val proposal = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseEIT_Image_Review_Availability_CoordinatorProposalConditionType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord(proposal, condition)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision(): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecisionT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowDecisionT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowDecision")
      }
      parser.parseObjectKey("selectedAction")
      val selectedAction = parseEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowDecision(selectedAction, disposition, notice)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshotT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot")
      }
      parser.parseObjectKey("preState")
      val preState = parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshotType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextState")
      val nextState = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedAction")
      val selectedAction = parseEIT_Image_Review_Availability_CoordinatorWorkflowActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Image_Review_Availability_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseEIT_Image_Review_Availability_CoordinatorDecisionNoticeType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot(preState, nextState, selectedAction, disposition, notice)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshotT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshotT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot")
      }
      parser.parseObjectKey("preState")
      val preState = parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshotType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextState")
      val nextState = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot(preState, nextState)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus(): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatus")
      }
      parser.parseObjectKey("generationState")
      val generationState = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("reviewState")
      val reviewState = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseEIT_Image_Review_Availability_CoordinatorPublicNoticeType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatus(generationState, reviewState, disposition, notice)
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batchEvent")
      val api_batchEvent = parseEIT_Image_Review_Availability_CoordinatorBatchEventType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(api_batchEvent)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batchEvent")
      val api_batchEvent = parseEIT_Image_Review_Availability_CoordinatorBatchEventType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(api_batchEvent)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_batchAssessment")
      val api_batchAssessment = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(api_batchAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batchAssessment")
      val api_batchAssessment = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(api_batchAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generatorFeedback")
      val api_generatorFeedback = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(api_generationPreState, api_generatorFeedback)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generatorFeedback")
      val api_generatorFeedback = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(api_generationPreState, api_generatorFeedback)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_feedbackAssessment")
      val api_feedbackAssessment = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(api_feedbackAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_feedbackAssessment")
      val api_feedbackAssessment = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(api_feedbackAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_viewerObservation")
      val api_viewerObservation = parseEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(api_viewerObservation)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_viewerObservation")
      val api_viewerObservation = parseEIT_Image_Review_Availability_CoordinatorViewerObservationType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(api_viewerObservation)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_viewerAssessment")
      val api_viewerAssessment = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(api_viewerAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_viewerAssessment")
      val api_viewerAssessment = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(api_viewerAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_feedbackAssessment")
      val api_feedbackAssessment = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryRequest")
      val api_recoveryRequest = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(api_feedbackAssessment, api_generationPreState, api_recoveryRequest)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_feedbackAssessment")
      val api_feedbackAssessment = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryRequest")
      val api_recoveryRequest = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequestType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(api_feedbackAssessment, api_generationPreState, api_recoveryRequest)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_generatorProposal")
      val api_generatorProposal = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(api_generatorProposal)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_generatorProposal")
      val api_generatorProposal = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(api_generatorProposal)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_batchAssessment")
      val api_batchAssessment = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_doctorRequest")
      val api_doctorRequest = parseEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generatorProposal")
      val api_generatorProposal = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewPreState")
      val api_reviewPreState = parseEIT_Image_Review_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_viewerAssessment")
      val api_viewerAssessment = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(api_batchAssessment, api_doctorRequest, api_generationPreState, api_generatorProposal, api_reviewPreState, api_viewerAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batchAssessment")
      val api_batchAssessment = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_doctorRequest")
      val api_doctorRequest = parseEIT_Image_Review_Availability_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generatorProposal")
      val api_generatorProposal = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewPreState")
      val api_reviewPreState = parseEIT_Image_Review_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_viewerAssessment")
      val api_viewerAssessment = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(api_batchAssessment, api_doctorRequest, api_generationPreState, api_generatorProposal, api_reviewPreState, api_viewerAssessment)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(api_generationDecision, api_generationPreState)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_generationPreState")
      val api_generationPreState = parseEIT_Image_Review_Availability_CoordinatorGenerationStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(api_generationDecision, api_generationPreState)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_workflowDecision")
      val api_workflowDecision = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(api_workflowDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P")
      }
      parser.parseObjectKey("api_reviewDecision")
      val api_reviewDecision = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewPreState")
      val api_reviewPreState = parseEIT_Image_Review_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(api_reviewDecision, api_reviewPreState)
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_reviewDecision")
      val api_reviewDecision = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewPreState")
      val api_reviewPreState = parseEIT_Image_Review_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(api_reviewDecision, api_reviewPreState)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(api_generationDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(api_generationDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_generationCommand")
      val api_generationCommand = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(api_generationCommand)
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_generationCommand")
      val api_generationCommand = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandType()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(api_generationCommand)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewDecision")
      val api_reviewDecision = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(api_generationDecision, api_reviewDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_generationDecision")
      val api_generationDecision = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewDecision")
      val api_reviewDecision = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(api_generationDecision, api_reviewDecision)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_reviewAvailability")
      val api_reviewAvailability = parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_workflowStatus")
      val api_workflowStatus = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(api_reviewAvailability, api_workflowStatus)
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(typeParsed: B): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_reviewAvailability")
      val api_reviewAvailability = parseEIT_Image_Review_Availability_CoordinatorReviewAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_workflowStatus")
      val api_workflowStatus = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      parser.parseObjectNext()
      return EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(api_reviewAvailability, api_workflowStatus)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload", "EIT_Image_Review_Availability_Coordinator.ReviewState_Payload", "EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload", "EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload", "EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload", "EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload", "EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload", "EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload", "EIT_Image_Review_Availability_Coordinator.GenerationState_Payload", "EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload", "EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload", "EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload", "EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload", "EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload", "EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload", "EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload", "EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload", "EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload", "EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload", "EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload", "EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload", "EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload", "EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload", "EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload", "EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload", "EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload", "EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P", "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchEvent_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorPublicNotice_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchCategory_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorDoctorRequest_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowAction_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorDecisionNotice_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorRecoveryRequest_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorViewerCondition_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchAssessment_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorViewerAssessment_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackCondition_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommand_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorViewerObservation_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposal_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorProposalCondition_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAvailability_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorRequestDisposition_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload" => val r = parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_PayloadT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS" => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchEvent_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchEvent_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchCategory_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchCategory_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedback_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedback_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.FeedbackCondition_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorFeedbackCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ViewerObservation_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorViewerObservation_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ViewerCondition_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorViewerCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.RecoveryRequest_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorRecoveryRequest_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorProposal_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorProposal_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o: EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ProposalCondition_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorProposalCondition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o: EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.DoctorRequest_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorDoctorRequest_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowAction_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowAction_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.RequestDisposition_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.DecisionNotice_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorDecisionNotice_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationPreStateSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewPreStateSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommand_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommand_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAvailability_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAvailability_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusGenerationState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowStatusDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o: EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.PublicNotice_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorPublicNotice_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchAssessment(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchAssessment(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchAssessment, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchAssessment(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchAssessment = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchAssessment()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchAssessment_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(s: String): Either[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment(parser: Parser): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.FeedbackAssessment_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorFeedbackAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerAssessment(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorViewerAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerAssessment(s: String): Either[EIT_Image_Review_Availability_Coordinator.ViewerAssessment, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerAssessment(parser: Parser): EIT_Image_Review_Availability_Coordinator.ViewerAssessment = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorViewerAssessment()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorViewerAssessment _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o: EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ViewerAssessment_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorViewerAssessment_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorProposalRecord_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowDecision(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowDecision, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowDecision(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowDecision _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowDecision_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowDecision_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatus(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatus, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatus(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowStatus = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowStatus _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o: EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(s: String): Either[EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload(parser: Parser): EIT_Image_Review_Availability_Coordinator.WorkflowStatus_Payload = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorWorkflowStatus_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorBatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorGenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o: EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(s: String): Either[EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS(parser: Parser): EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Review_Availability_CoordinatorAvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}