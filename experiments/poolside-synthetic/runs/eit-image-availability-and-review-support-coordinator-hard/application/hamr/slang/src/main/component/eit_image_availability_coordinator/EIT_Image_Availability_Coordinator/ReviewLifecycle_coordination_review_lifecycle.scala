// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReviewLifecycle_coordination_review_lifecycle {

  def initialise(api: ReviewLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_reviewFrame(EIT_Image_Availability_Coordinator.ReviewFrame.example())
  }

  def timeTriggered(api: ReviewLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_reviewFacts: Option[EIT_Image_Availability_Coordinator.ReviewFacts.Type] = api.get_reviewFacts()
    api.logInfo(s"Received on data port reviewFacts: ${apiUsage_reviewFacts}")
    val apiUsage_recoveryFrame: Option[EIT_Image_Availability_Coordinator.RecoveryFrame] = api.get_recoveryFrame()
    api.logInfo(s"Received on data port recoveryFrame: ${apiUsage_recoveryFrame}")
    val apiUsage_availabilityFrame: Option[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame] = api.get_availabilityFrame()
    api.logInfo(s"Received on data port availabilityFrame: ${apiUsage_availabilityFrame}")
  }

  def finalise(api: ReviewLifecycle_Operational_Api): Unit = { }
}
