// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner {

  def initialise(api: ReviewAccessQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_viewerAssessment(EIT_Image_Review_Availability_Coordinator.ViewerAssessment.example())
  }

  def timeTriggered(api: ReviewAccessQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_viewerObservation: Option[EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type] = api.get_viewerObservation()
    api.logInfo(s"Received on data port viewerObservation: ${apiUsage_viewerObservation}")
  }

  def finalise(api: ReviewAccessQualificationOwner_Operational_Api): Unit = { }
}
