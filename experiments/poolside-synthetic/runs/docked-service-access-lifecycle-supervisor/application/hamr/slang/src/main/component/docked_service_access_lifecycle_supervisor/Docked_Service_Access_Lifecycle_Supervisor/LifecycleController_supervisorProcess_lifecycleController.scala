// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleController_supervisorProcess_lifecycleController {

  def initialise(api: LifecycleController_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_monitorPrestate(Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.IDLE_OUTSIDE)
    api.put_arbiterPrestate(Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.IDLE_OUTSIDE)
    api.put_controlProposal(Docked_Service_Access_Lifecycle_Supervisor.ControlProposal.example())
    api.put_lifecycleSnapshot(Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot.example())
  }

  def timeTriggered(api: LifecycleController_Operational_Api): Unit = {
    // example api usage

    val apiUsage_admittedDirective: Option[Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type] = api.get_admittedDirective()
    api.logInfo(s"Received on data port admittedDirective: ${apiUsage_admittedDirective}")
  }

  def finalise(api: LifecycleController_Operational_Api): Unit = { }
}
