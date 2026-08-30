// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleReporter_supervisorProcess_lifecycleReporter {

  def initialise(api: LifecycleReporter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotReport(Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.OUTSIDE_IDLE)
    api.put_stationReport(Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.NO_ACCESS)
  }

  def timeTriggered(api: LifecycleReporter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycleSnapshot: Option[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot] = api.get_lifecycleSnapshot()
    api.logInfo(s"Received on data port lifecycleSnapshot: ${apiUsage_lifecycleSnapshot}")
    val apiUsage_gatedControl: Option[Docked_Service_Access_Lifecycle_Supervisor.GatedControl] = api.get_gatedControl()
    api.logInfo(s"Received on data port gatedControl: ${apiUsage_gatedControl}")
  }

  def finalise(api: LifecycleReporter_Operational_Api): Unit = { }
}
