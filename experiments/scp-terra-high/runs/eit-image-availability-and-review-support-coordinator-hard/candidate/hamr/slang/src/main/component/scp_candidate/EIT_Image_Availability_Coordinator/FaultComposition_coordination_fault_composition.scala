// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultComposition_coordination_fault_composition {

  def initialise(api: FaultComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_faultSummary(EIT_Image_Availability_Coordinator.FaultSummary.example())
  }

  def finalise(api: FaultComposition_Operational_Api): Unit = { }
  def timeTriggered(api: FaultComposition_Operational_Api): Unit = { Contract(Modifies(api)) }
}
