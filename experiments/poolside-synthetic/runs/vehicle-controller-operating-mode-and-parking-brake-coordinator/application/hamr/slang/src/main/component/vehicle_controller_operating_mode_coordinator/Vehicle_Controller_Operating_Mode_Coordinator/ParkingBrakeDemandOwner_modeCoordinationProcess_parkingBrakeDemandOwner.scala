// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner {

  def initialise(api: ParkingBrakeDemandOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_brakeDemand(Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.RequireApply)
  }

  def timeTriggered(api: ParkingBrakeDemandOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_maintenanceSnapshot: Option[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot] = api.get_maintenanceSnapshot()
    api.logInfo(s"Received on data port maintenanceSnapshot: ${apiUsage_maintenanceSnapshot}")
    val apiUsage_episodeSnapshot: Option[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot] = api.get_episodeSnapshot()
    api.logInfo(s"Received on data port episodeSnapshot: ${apiUsage_episodeSnapshot}")
    val apiUsage_selectedIndication: Option[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type] = api.get_selectedIndication()
    api.logInfo(s"Received on data port selectedIndication: ${apiUsage_selectedIndication}")
  }

  def finalise(api: ParkingBrakeDemandOwner_Operational_Api): Unit = { }
}
