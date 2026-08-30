// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor {

  def initialise(api: GenerationSlotStateGovernor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_generationPreState(EIT_Image_Review_Availability_Coordinator.GenerationState.GENERATION_EMPTY)
    api.put_generationDecision(EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot.example())
  }

  def timeTriggered(api: GenerationSlotStateGovernor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_workflowDecision: Option[EIT_Image_Review_Availability_Coordinator.WorkflowDecision] = api.get_workflowDecision()
    api.logInfo(s"Received on data port workflowDecision: ${apiUsage_workflowDecision}")
  }

  def finalise(api: GenerationSlotStateGovernor_Operational_Api): Unit = { }
}
