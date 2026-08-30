// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy {

  def initialise(api: AvailabilityPublicationPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_reviewAvailability(EIT_Image_Review_Availability_Coordinator.ReviewAvailability.NO_IMAGE_AVAILABLE)
    api.put_workflowStatus(EIT_Image_Review_Availability_Coordinator.WorkflowStatus.example())
  }

  def timeTriggered(api: AvailabilityPublicationPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    val g: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = api.get_generationDecision().get
    val r: EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = api.get_reviewDecision().get
    val availability: EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type =
      if (g.nextState == EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_A &&
          r.nextState == EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_A)
        EIT_Image_Review_Availability_Coordinator.ReviewAvailability.IMAGE_A_AVAILABLE_FOR_REVIEW
      else if (g.nextState == EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_B &&
               r.nextState == EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_B)
        EIT_Image_Review_Availability_Coordinator.ReviewAvailability.IMAGE_B_AVAILABLE_FOR_REVIEW
      else EIT_Image_Review_Availability_Coordinator.ReviewAvailability.NO_IMAGE_AVAILABLE
    val gs: EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.Type = g.nextState match {
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_A => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_A
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_B => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_B
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_A => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_A
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_B => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_B
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATION_BLOCKED => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATION_BLOCKED
      case _ => EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATION_EMPTY
    }
    val rs: EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.Type = r.nextState match {
      case EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_A => EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEWING_A
      case EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_B => EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEWING_B
      case _ => EIT_Image_Review_Availability_Coordinator.WorkflowStatusReviewState.REVIEW_CLOSED
    }
    val disposition: EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.Type = g.disposition match {
      case EIT_Image_Review_Availability_Coordinator.RequestDisposition.ACCEPTED => EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.ACCEPTED
      case EIT_Image_Review_Availability_Coordinator.RequestDisposition.REJECTED => EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.REJECTED
      case EIT_Image_Review_Availability_Coordinator.RequestDisposition.PREEMPTED => EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.PREEMPTED
      case EIT_Image_Review_Availability_Coordinator.RequestDisposition.RECOVERY_APPLIED => EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.RECOVERY_APPLIED
      case _ => EIT_Image_Review_Availability_Coordinator.WorkflowStatusDisposition.NO_REQUEST_DISPOSITION
    }
    val notice: EIT_Image_Review_Availability_Coordinator.PublicNotice.Type = g.notice match {
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.INVALID_BATCH_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.INVALID_BATCH
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.GENERATOR_BUSY_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.GENERATOR_BUSY
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.FEEDBACK_FAULT_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.FEEDBACK_FAULT
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_REJECTED_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.RESET_REJECTED
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.RESET_CLEARED_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.RESET_CLEARED
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.VIEWER_UNAVAILABLE_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.VIEWER_UNAVAILABLE
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.NO_IMAGE_READY_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.NO_IMAGE_READY
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.IMAGE_REPLACED_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_REPLACED
      case EIT_Image_Review_Availability_Coordinator.DecisionNotice.REQUEST_PREEMPTED_NOTICE => EIT_Image_Review_Availability_Coordinator.PublicNotice.REQUEST_PREEMPTED
      case _ if gs == EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATION_BLOCKED => EIT_Image_Review_Availability_Coordinator.PublicNotice.RECOVERY_REQUIRED
      case _ if gs == EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_A || gs == EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.GENERATING_B => EIT_Image_Review_Availability_Coordinator.PublicNotice.WAITING_FOR_GENERATOR
      case _ if availability != EIT_Image_Review_Availability_Coordinator.ReviewAvailability.NO_IMAGE_AVAILABLE => EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_AVAILABLE
      case _ if gs == EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_A || gs == EIT_Image_Review_Availability_Coordinator.WorkflowStatusGenerationState.IMAGE_READY_B => EIT_Image_Review_Availability_Coordinator.PublicNotice.IMAGE_READY
      case _ => EIT_Image_Review_Availability_Coordinator.PublicNotice.NONE
    }
    api.put_reviewAvailability(availability)
    api.put_workflowStatus(EIT_Image_Review_Availability_Coordinator.WorkflowStatus(gs, rs, disposition, notice))
  }

  def finalise(api: AvailabilityPublicationPolicy_Operational_Api): Unit = { }
}
