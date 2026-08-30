// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityArbitration_coordination_availability_arbitration {

  def initialise(api: AvailabilityArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decisionFrame(EIT_Image_Availability_Coordinator.DecisionFrame.example())
  }

  def finalise(api: AvailabilityArbitration_Operational_Api): Unit = { }
  def timeTriggered(api: AvailabilityArbitration_Operational_Api): Unit = { Contract(Modifies(api)) }
}
