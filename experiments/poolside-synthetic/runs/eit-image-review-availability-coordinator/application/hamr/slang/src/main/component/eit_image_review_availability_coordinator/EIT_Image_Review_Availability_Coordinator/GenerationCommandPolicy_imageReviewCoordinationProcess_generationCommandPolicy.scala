// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object GenerationCommandPolicy_imageReviewCoordinationProcess_generationCommandPolicy {

  def initialise(api: GenerationCommandPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_generationCommand(EIT_Image_Review_Availability_Coordinator.GenerationCommand.NO_GENERATION_COMMAND)
  }

  def timeTriggered(api: GenerationCommandPolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_generationDecision: Option[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot] = api.get_generationDecision()
    api.logInfo(s"Received on data port generationDecision: ${apiUsage_generationDecision}")
  }

  def finalise(api: GenerationCommandPolicy_Operational_Api): Unit = { }
}
