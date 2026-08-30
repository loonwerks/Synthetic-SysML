// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner {

  def initialise(api: GeneratorOutcomeRecoveryOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_generatorProposal(EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord.example())
  }

  def timeTriggered(api: GeneratorOutcomeRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_recoveryRequest: Option[EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type] = api.get_recoveryRequest()
    api.logInfo(s"Received on data port recoveryRequest: ${apiUsage_recoveryRequest}")
    val apiUsage_generationPreState: Option[EIT_Image_Review_Availability_Coordinator.GenerationState.Type] = api.get_generationPreState()
    api.logInfo(s"Received on data port generationPreState: ${apiUsage_generationPreState}")
    val apiUsage_feedbackAssessment: Option[EIT_Image_Review_Availability_Coordinator.FeedbackAssessment] = api.get_feedbackAssessment()
    api.logInfo(s"Received on data port feedbackAssessment: ${apiUsage_feedbackAssessment}")
  }

  def finalise(api: GeneratorOutcomeRecoveryOwner_Operational_Api): Unit = { }
}
