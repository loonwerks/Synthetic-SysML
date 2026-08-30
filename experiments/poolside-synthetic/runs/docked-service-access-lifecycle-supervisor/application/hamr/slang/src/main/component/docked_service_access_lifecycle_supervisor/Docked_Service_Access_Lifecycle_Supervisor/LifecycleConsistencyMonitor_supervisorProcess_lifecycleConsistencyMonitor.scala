// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor {

  def initialise(api: LifecycleConsistencyMonitor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_operationalAssessment(Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.OUTSIDE_STABLE)
  }

  def timeTriggered(api: LifecycleConsistencyMonitor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_dockReadiness: Option[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type] = api.get_dockReadiness()
    api.logInfo(s"Received on data port dockReadiness: ${apiUsage_dockReadiness}")
    val apiUsage_serviceInterlock: Option[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type] = api.get_serviceInterlock()
    api.logInfo(s"Received on data port serviceInterlock: ${apiUsage_serviceInterlock}")
    val apiUsage_lifecyclePrestate: Option[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type] = api.get_lifecyclePrestate()
    api.logInfo(s"Received on data port lifecyclePrestate: ${apiUsage_lifecyclePrestate}")
  }

  def finalise(api: LifecycleConsistencyMonitor_Operational_Api): Unit = { }
}
