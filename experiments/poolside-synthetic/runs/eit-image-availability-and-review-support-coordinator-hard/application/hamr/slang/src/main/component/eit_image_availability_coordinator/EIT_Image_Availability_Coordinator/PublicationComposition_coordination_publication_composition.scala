// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object PublicationComposition_coordination_publication_composition {

  def initialise(api: PublicationComposition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_upstreamDisposition(EIT_Image_Availability_Coordinator.UpstreamDisposition.NO_ACTION)
    api.put_analysisAvailability(EIT_Image_Availability_Coordinator.AvailabilityFrame.example())
  }

  def timeTriggered(api: PublicationComposition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_decisionFrame: Option[EIT_Image_Availability_Coordinator.DecisionFrame] = api.get_decisionFrame()
    api.logInfo(s"Received on data port decisionFrame: ${apiUsage_decisionFrame}")
  }

  def finalise(api: PublicationComposition_Operational_Api): Unit = { }
}
