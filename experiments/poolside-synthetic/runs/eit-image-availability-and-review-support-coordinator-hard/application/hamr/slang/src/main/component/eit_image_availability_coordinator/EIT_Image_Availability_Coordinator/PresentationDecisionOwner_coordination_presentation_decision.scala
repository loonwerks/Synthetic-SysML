// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object PresentationDecisionOwner_coordination_presentation_decision {

  def initialise(api: PresentationDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_presentationFrame(EIT_Image_Availability_Coordinator.PresentationFrame.example())
  }

  def timeTriggered(api: PresentationDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_availabilityFrame: Option[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame] = api.get_availabilityFrame()
    api.logInfo(s"Received on data port availabilityFrame: ${apiUsage_availabilityFrame}")
    val apiUsage_reviewFrame: Option[EIT_Image_Availability_Coordinator.ReviewFrame] = api.get_reviewFrame()
    api.logInfo(s"Received on data port reviewFrame: ${apiUsage_reviewFrame}")
  }

  def finalise(api: PresentationDecisionOwner_Operational_Api): Unit = { }
}
