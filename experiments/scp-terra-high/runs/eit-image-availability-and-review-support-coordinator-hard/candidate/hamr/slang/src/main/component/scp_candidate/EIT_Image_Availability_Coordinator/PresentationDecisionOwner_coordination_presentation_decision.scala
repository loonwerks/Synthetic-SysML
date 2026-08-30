// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PresentationDecisionOwner_coordination_presentation_decision {

  def initialise(api: PresentationDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_presentationFrame(EIT_Image_Availability_Coordinator.PresentationFrame.example())
  }

  def finalise(api: PresentationDecisionOwner_Operational_Api): Unit = { }
  def timeTriggered(api: PresentationDecisionOwner_Operational_Api): Unit = { Contract(Modifies(api)) }
}
