// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DockReadinessQualifier_supervisorProcess_dockReadinessQualifier {

  def initialise(api: DockReadinessQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_monitorReadiness(Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.DOCK_READY)
    api.put_gateReadiness(Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.DOCK_READY)
  }

  def timeTriggered(api: DockReadinessQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_berthObservation: Option[Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type] = api.get_berthObservation()
    api.logInfo(s"Received on data port berthObservation: ${apiUsage_berthObservation}")
    val apiUsage_shipCondition: Option[Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type] = api.get_shipCondition()
    api.logInfo(s"Received on data port shipCondition: ${apiUsage_shipCondition}")
  }

  def finalise(api: DockReadinessQualifier_Operational_Api): Unit = { }
}
