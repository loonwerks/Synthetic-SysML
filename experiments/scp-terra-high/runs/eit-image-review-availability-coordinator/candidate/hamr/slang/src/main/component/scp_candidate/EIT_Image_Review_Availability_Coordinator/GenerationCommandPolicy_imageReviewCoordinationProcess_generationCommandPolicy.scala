// #Sireum

package scp_candidate.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy {

  def initialise(api: GenerationCommandPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_generationCommand(EIT_Image_Review_Availability_Coordinator.GenerationCommand.NO_GENERATION_COMMAND)
  }

  def timeTriggered(api: GenerationCommandPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    val d: EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot = api.get_generationDecision().get
    val command: EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type = d.nextState match {
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_A =>
        EIT_Image_Review_Availability_Coordinator.GenerationCommand.GENERATE_FROM_BATCH_A
      case EIT_Image_Review_Availability_Coordinator.GenerationDecisionNextState.GENERATING_B =>
        EIT_Image_Review_Availability_Coordinator.GenerationCommand.GENERATE_FROM_BATCH_B
      case _ => EIT_Image_Review_Availability_Coordinator.GenerationCommand.NO_GENERATION_COMMAND
    }
    api.put_generationCommand(command)
  }

  def finalise(api: GenerationCommandPolicy_Operational_Api): Unit = { }
}
