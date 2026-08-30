// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner {

  def initialise(api: MaintenanceSessionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_maintenanceSnapshot(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot.example())
    api.put_snapshotToBrake(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot.example())
  }

  def timeTriggered(api: MaintenanceSessionOwner_Operational_Api): Unit = { }
  def finalise(api: MaintenanceSessionOwner_Operational_Api): Unit = { }
}
