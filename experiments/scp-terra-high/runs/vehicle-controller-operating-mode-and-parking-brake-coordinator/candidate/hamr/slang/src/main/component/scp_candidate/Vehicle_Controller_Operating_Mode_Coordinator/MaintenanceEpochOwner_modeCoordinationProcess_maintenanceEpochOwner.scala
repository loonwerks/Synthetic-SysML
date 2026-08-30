// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner {

  def initialise(api: MaintenanceEpochOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToConflict(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts.example())
    api.put_factsToPriority(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts.example())
    api.put_factsToSession(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts.example())
  }

  def timeTriggered(api: MaintenanceEpochOwner_Operational_Api): Unit = { }
  def finalise(api: MaintenanceEpochOwner_Operational_Api): Unit = { }
}
