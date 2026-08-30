// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy {

  def initialise(api: AvailabilityPublicationPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewAvailability(EIT_Image_Review_Availability_Coordinator.ReviewAvailability.NO_IMAGE_AVAILABLE)
    api.put_workflowStatus(EIT_Image_Review_Availability_Coordinator.WorkflowStatus.example())
  }

  def timeTriggered(api: AvailabilityPublicationPolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_generationDecision: Option[EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot] = api.get_generationDecision()
    api.logInfo(s"Received on data port generationDecision: ${apiUsage_generationDecision}")
    val apiUsage_reviewDecision: Option[EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot] = api.get_reviewDecision()
    api.logInfo(s"Received on data port reviewDecision: ${apiUsage_reviewDecision}")
  }

  def finalise(api: AvailabilityPublicationPolicy_Operational_Api): Unit = { }
}
