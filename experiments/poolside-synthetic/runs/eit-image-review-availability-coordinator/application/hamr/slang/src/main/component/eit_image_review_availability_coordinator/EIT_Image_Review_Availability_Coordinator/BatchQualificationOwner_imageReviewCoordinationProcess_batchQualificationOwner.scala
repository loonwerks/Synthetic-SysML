// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner {

  def initialise(api: BatchQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batchAssessment(EIT_Image_Review_Availability_Coordinator.BatchAssessment.example())
  }

  def timeTriggered(api: BatchQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batchEvent: Option[EIT_Image_Review_Availability_Coordinator.BatchEvent.Type] = api.get_batchEvent()
    api.logInfo(s"Received on data port batchEvent: ${apiUsage_batchEvent}")
  }

  def finalise(api: BatchQualificationOwner_Operational_Api): Unit = { }
}
