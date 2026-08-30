// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner {

  def initialise(api: GeneratorFeedbackQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_feedbackAssessment(EIT_Image_Review_Availability_Coordinator.FeedbackAssessment.example())
  }

  def timeTriggered(api: GeneratorFeedbackQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_generatorFeedback: Option[EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type] = api.get_generatorFeedback()
    api.logInfo(s"Received on data port generatorFeedback: ${apiUsage_generatorFeedback}")
    val apiUsage_generationPreState: Option[EIT_Image_Review_Availability_Coordinator.GenerationState.Type] = api.get_generationPreState()
    api.logInfo(s"Received on data port generationPreState: ${apiUsage_generationPreState}")
  }

  def finalise(api: GeneratorFeedbackQualificationOwner_Operational_Api): Unit = { }
}
