// #Sireum

package eit_image_review_availability_coordinator.EIT_Image_Review_Availability_Coordinator

import org.sireum._
import eit_image_review_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor {

  def initialise(api: ReviewSessionStateGovernor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewPreState(EIT_Image_Review_Availability_Coordinator.ReviewState.REVIEW_CLOSED)
    api.put_reviewDecision(EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot.example())
  }

  def timeTriggered(api: ReviewSessionStateGovernor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_workflowDecision: Option[EIT_Image_Review_Availability_Coordinator.WorkflowDecision] = api.get_workflowDecision()
    api.logInfo(s"Received on data port workflowDecision: ${apiUsage_workflowDecision}")
  }

  def finalise(api: ReviewSessionStateGovernor_Operational_Api): Unit = { }
}
