// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityWorkflowArbiter_imageReviewCoordinationProcess_availabilityWorkflowArbiter {

  def initialise(api: AvailabilityWorkflowArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_workflowDecision(EIT_Image_Review_Availability_Coordinator.WorkflowDecision.example())
  }

  def timeTriggered(api: AvailabilityWorkflowArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_doctorRequest: Option[EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type] = api.get_doctorRequest()
    api.logInfo(s"Received on data port doctorRequest: ${apiUsage_doctorRequest}")
    val apiUsage_generationPreState: Option[EIT_Image_Review_Availability_Coordinator.GenerationState.Type] = api.get_generationPreState()
    api.logInfo(s"Received on data port generationPreState: ${apiUsage_generationPreState}")
    val apiUsage_reviewPreState: Option[EIT_Image_Review_Availability_Coordinator.ReviewState.Type] = api.get_reviewPreState()
    api.logInfo(s"Received on data port reviewPreState: ${apiUsage_reviewPreState}")
    val apiUsage_batchAssessment: Option[EIT_Image_Review_Availability_Coordinator.BatchAssessment] = api.get_batchAssessment()
    api.logInfo(s"Received on data port batchAssessment: ${apiUsage_batchAssessment}")
    val apiUsage_viewerAssessment: Option[EIT_Image_Review_Availability_Coordinator.ViewerAssessment] = api.get_viewerAssessment()
    api.logInfo(s"Received on data port viewerAssessment: ${apiUsage_viewerAssessment}")
    val apiUsage_generatorProposal: Option[EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord] = api.get_generatorProposal()
    api.logInfo(s"Received on data port generatorProposal: ${apiUsage_generatorProposal}")
  }

  def finalise(api: AvailabilityWorkflowArbiter_Operational_Api): Unit = { }
}
