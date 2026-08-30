// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_coordination_availability_decision {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availabilityFrame(EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame.example())
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = { Contract(Modifies(api)) }
}
