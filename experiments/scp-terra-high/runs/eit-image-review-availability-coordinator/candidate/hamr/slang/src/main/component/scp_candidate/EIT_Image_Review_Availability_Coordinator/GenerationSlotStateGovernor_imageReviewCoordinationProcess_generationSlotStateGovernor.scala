// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor {
  var committedGenerationState: EIT_Image_Review_Availability_Coordinator.GenerationState.Type =
    EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY

  def initialise(api: GenerationSlotStateGovernor_Initialization_Api): Unit = {
    Contract(Modifies(api, committedGenerationState))
    committedGenerationState = EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY
    api.put_generationPreState(committedGenerationState)
    api.put_generationDecision(decision(committedGenerationState,
      EIT_Image_Review_Availability_Coordinator.WorkflowDecision.example()))
  }

  def timeTriggered(api: GenerationSlotStateGovernor_Operational_Api): Unit = {
    Contract(Modifies(api, committedGenerationState))
    val pre: EIT_Image_Review_Availability_Coordinator.GenerationState.Type = committedGenerationState
    val w: EIT_Image_Review_Availability_Coordinator.WorkflowDecision = api.get_workflowDecision().get
    committedGenerationState = w.selectedAction match {
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_A_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_A
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.START_BATCH_B_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_B
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_A_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.ACCEPT_IMAGE_B_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.BLOCK_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_BLOCKED
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLEAR_BLOCK_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY
      case EIT_Image_Review_Availability_Coordinator.WorkflowAction.CLOSE_REVIEW_ACTION => EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY
      case _ => pre
    }
    api.put_generationPreState(pre)
    api.put_generationDecision(decision(pre, w))
  }

  def decision(pre: EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
               w: EIT_Image_Review_Availability_Coordinator.WorkflowDecision): EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = {
    val ps: EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.Type = pre match {
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_A => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATING_A
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_B => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATING_B
      case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.IMAGE_READY_A
      case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.IMAGE_READY_B
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_BLOCKED => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATION_BLOCKED
      case _ => EIT_Image_Review_Availability_Coordinator.GenerationPreStateSnapshot.GENERATION_EMPTY
    }
    val ns: EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.Type = committedGenerationState match {
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_A => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_A
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATING_B => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_B
      case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_A => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_A
      case EIT_Image_Review_Availability_Coordinator.GenerationState.IMAGE_READY_B => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.IMAGE_READY_B
      case EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_BLOCKED => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATION_BLOCKED
      case _ => EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATION_EMPTY
    }
    return EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot(ps, ns, w.selectedAction, w.disposition, w.notice)
  }

  def finalise(api: GenerationSlotStateGovernor_Operational_Api): Unit = { }
}
