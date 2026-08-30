// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor {
  var committedReviewState: EIT_Image_Review_Availability_Coordinator.ReviewState.Type =
    EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED

  def initialise(api: ReviewSessionStateGovernor_Initialization_Api): Unit = {
    Contract(Modifies(api, committedReviewState))
    committedReviewState = EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
    api.put_reviewPreState(committedReviewState)
    api.put_reviewDecision(snapshot(committedReviewState))
  }

  def timeTriggered(api: ReviewSessionStateGovernor_Operational_Api): Unit = {
    Contract(Modifies(api, committedReviewState))
    val pre: EIT_Image_Review_Availability_Coordinator.ReviewState.Type = committedReviewState
    val action: EIT_Image_Review_Availability_Coordinator.WorkflowAction.Type = api.get_workflowDecision().get.selectedAction
    committedReviewState = action match {
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_A_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_A
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.OPEN_IMAGE_B_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_B
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLOSE_REVIEW_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.BLOCK_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLEAR_BLOCK_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_A_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_B_ACTION => EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED
      case _ => pre
    }
    api.put_reviewPreState(pre)
    api.put_reviewDecision(snapshot(pre))
  }

  def snapshot(pre: EIT_Image_Review_Availability_Coordinator.ReviewState.Type): EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot = {
    val p: EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.Type = pre match {
      case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_A => EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEWING_A
      case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_B => EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEWING_B
      case _ => EIT_Image_Review_Availability_Coordinator.ReviewPreStateSnapshot.REVIEW_CLOSED
    }
    val n: EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.Type = committedReviewState match {
      case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_A => EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_A
      case EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEWING_B => EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEWING_B
      case _ => EIT_Image_Review_Availability_Coordinator.ReviewDecisionNextState.REVIEW_CLOSED
    }
    return EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot(p, n)
  }

  def finalise(api: ReviewSessionStateGovernor_Operational_Api): Unit = { }
}
