// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PublicationComposition_coordination_publication_composition {

  def initialise(api: PublicationComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_upstreamDisposition(EIT_Image_Availability_Coordinator.UpstreamDisposition.NO_ACTION)
    api.put_analysisAvailability(EIT_Image_Availability_Coordinator.AvailabilityFrame.example())
  }

  def finalise(api: PublicationComposition_Operational_Api): Unit = { }
  def timeTriggered(api: PublicationComposition_Operational_Api): Unit = { Contract(Modifies(api)) }
}
