// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner {

  def initialise(api: OperatingDemandOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_demandSnapshot(Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot.example())
  }

  def timeTriggered(api: OperatingDemandOwner_Operational_Api): Unit = { }
  def finalise(api: OperatingDemandOwner_Operational_Api): Unit = { }
}
