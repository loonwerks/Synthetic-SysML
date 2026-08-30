// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate {

  def initialise(api: MovementAndAccessSafetyGate_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gatedControl(Docked_Service_Access_Lifecycle_Supervisor.GatedControl.example())
    api.put_movementDirective(Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.HOLD)
    api.put_serviceAccess(Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.LOCKED)
  }

  def timeTriggered(api: MovementAndAccessSafetyGate_Operational_Api): Unit = {
    // example api usage

    val apiUsage_controlProposal: Option[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal] = api.get_controlProposal()
    api.logInfo(s"Received on data port controlProposal: ${apiUsage_controlProposal}")
    val apiUsage_dockReadiness: Option[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type] = api.get_dockReadiness()
    api.logInfo(s"Received on data port dockReadiness: ${apiUsage_dockReadiness}")
    val apiUsage_serviceInterlock: Option[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type] = api.get_serviceInterlock()
    api.logInfo(s"Received on data port serviceInterlock: ${apiUsage_serviceInterlock}")
  }

  def finalise(api: MovementAndAccessSafetyGate_Operational_Api): Unit = { }
}
