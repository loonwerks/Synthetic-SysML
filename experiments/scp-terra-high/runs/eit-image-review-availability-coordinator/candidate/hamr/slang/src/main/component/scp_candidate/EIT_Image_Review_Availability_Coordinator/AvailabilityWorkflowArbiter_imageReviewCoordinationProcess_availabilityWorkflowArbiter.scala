// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter {

  def initialise(api: AvailabilityWorkflowArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_workflowDecision(EIT_Image_Review_Availability_Coordinator.WorkflowDecision.example())
  }

  def timeTriggered(api: AvailabilityWorkflowArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type = api.get_doctorRequest().get
    val generation: EIT_Image_Review_Availability_Coordinator.GenerationState.Type = api.get_generationPreState().get
    val review: EIT_Image_Review_Availability_Coordinator.ReviewState.Type = api.get_reviewPreState().get
    val batch: EIT_Image_Review_Availability_Coordinator.BatchAssessment = api.get_batchAssessment().get
    val viewer: EIT_Image_Review_Availability_Coordinator.ViewerAssessment = api.get_viewerAssessment().get
    val proposal: EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord = api.get_generatorProposal().get
    val d: EIT_Image_Review_Availability_Coordinator.WorkflowDecision =
      if (proposal.proposal != EIT_Image_Review_Availability_Coordinator.GeneratorProposal.NO_GENERATOR_PROPOSAL ||
          proposal.condition == EIT_Image_Review_Availability_Coordinator.ProposalCondition.RESET_INAPPLICABLE) {
        proposal.proposal match {
          case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.BLOCK_GENERATION =>
            if (request != EIT_Image_Review_Availability_Coordinator.DoctorRequest.NO_DOCTOR_REQUEST || batch.usable)
              decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.BLOCK_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.FEEDBACK_FAULT_NOTICE)
            else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.BLOCK_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.RECOVERY_APPLIED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.FEEDBACK_FAULT_NOTICE)
          case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_A =>
            completion(EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_A_ACTION, request, batch.usable)
          case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.ACCEPT_IMAGE_B =>
            completion(EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_B_ACTION, request, batch.usable)
          case EIT_Image_Review_Availability_Coordinator.GeneratorProposal.CLEAR_GENERATION_BLOCK =>
            if (request != EIT_Image_Review_Availability_Coordinator.DoctorRequest.NO_DOCTOR_REQUEST || batch.usable)
              decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLEAR_BLOCK_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_CLEARED_NOTICE)
            else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLEAR_BLOCK_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.RECOVERY_APPLIED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_CLEARED_NOTICE)
          case _ => decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_REJECTED_NOTICE)
        }
      } else if (request == EIT_Image_Review_Availability_Coordinator.DoctorRequest.CLOSE_REVIEW) {
        if (review == EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED)
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_IMAGE_READY_NOTICE)
        else if (batch.usable)
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLOSE_REVIEW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE)
        else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLOSE_REVIEW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_CLOSED_NOTICE)
      } else if (request == EIT_Image_Review_Availability_Coordinator.DoctorRequest.OPEN_AVAILABLE_IMAGE) {
        if (!viewer.accessible)
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.VIEWER_UNAVAILABLE_NOTICE)
        else if (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A && review == EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED)
          if (batch.usable) decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_A_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE)
          else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_A_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_OPENED_NOTICE)
        else if (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B && review == EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED)
          if (batch.usable) decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_B_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE)
          else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_B_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_OPENED_NOTICE)
        else decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_IMAGE_READY_NOTICE)
      } else {
        batch.batchCategory match {
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.INVALID_BATCH =>
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.INVALID_BATCH_NOTICE)
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_A
            if review == EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED && (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY || generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A || generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B) =>
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_A_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED,
            if (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY) EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_DECISION_NOTICE else EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_REPLACED_NOTICE)
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_B
            if review == EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED && (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY || generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A || generation == EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B) =>
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_B_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED,
            if (generation == EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY) EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_DECISION_NOTICE else EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_REPLACED_NOTICE)
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_A =>
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.GENERATOR_BUSY_NOTICE)
        case EIT_Image_Review_Availability_Coordinator.BatchCategory.USABLE_BATCH_B =>
          decision(EIT_Image_Review_Availability_Coordinator.WorkflowAction.NO_WORKFLOW_ACTION, EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.GENERATOR_BUSY_NOTICE)
        case _ => EIT_Image_Review_Availability_Coordinator.WorkflowDecision.example()
        }
      }
    api.put_workflowDecision(d)
  }

  def decision(a: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type, d: EIT_Image_Review_Availability_Coordinator.RequestDisposition.Type, n: EIT_Image_Review_Availability_Coordinator.DecisionNotice.Type): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
    return EIT_Image_Review_Availability_Coordinator.WorkflowDecision(a, d, n)
  }

  def completion(a: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type, r: EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type, usable: B): EIT_Image_Review_Availability_Coordinator.WorkflowDecision = {
    if (r != EIT_Image_Review_Availability_Coordinator.DoctorRequest.NO_DOCTOR_REQUEST || usable) {
      return decision(a, EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE)
    } else {
      return decision(a, EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED, EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_DECISION_NOTICE)
    }
  }

  def finalise(api: AvailabilityWorkflowArbiter_Operational_Api): Unit = { }
}
