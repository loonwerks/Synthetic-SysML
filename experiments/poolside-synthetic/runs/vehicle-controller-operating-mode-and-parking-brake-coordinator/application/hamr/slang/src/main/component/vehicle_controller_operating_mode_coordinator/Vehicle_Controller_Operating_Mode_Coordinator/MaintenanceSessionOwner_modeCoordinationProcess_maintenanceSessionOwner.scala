// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner {

  def initialise(api: MaintenanceSessionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_maintenanceSnapshot(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot.example())
    api.put_snapshotToBrake(Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot.example())
  }

  def timeTriggered(api: MaintenanceSessionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_selectedIndication: Option[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type] = api.get_selectedIndication()
    api.logInfo(s"Received on data port selectedIndication: ${apiUsage_selectedIndication}")
    val apiUsage_maintenanceFacts: Option[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts] = api.get_maintenanceFacts()
    api.logInfo(s"Received on data port maintenanceFacts: ${apiUsage_maintenanceFacts}")
  }

  def finalise(api: MaintenanceSessionOwner_Operational_Api): Unit = { }
}
