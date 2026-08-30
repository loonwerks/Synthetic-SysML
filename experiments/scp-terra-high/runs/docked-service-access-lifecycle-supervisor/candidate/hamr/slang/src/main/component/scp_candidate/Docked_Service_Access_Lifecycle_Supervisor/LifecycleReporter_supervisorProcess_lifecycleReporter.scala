// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleReporter_supervisorProcess_lifecycleReporter {

  def initialise(api: LifecycleReporter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REPORT_INITIAL_SAFE
        api.pilotReport == PilotLifecycleReport.OUTSIDE_IDLE &&
          api.stationReport == StationAccessReport.NO_ACCESS
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotReport(Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.OUTSIDE_IDLE)
    api.put_stationReport(Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.NO_ACCESS)
  }

  def timeTriggered(api: LifecycleReporter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val pilot: PilotLifecycleReport.Type = PilotLifecycleReport.RECOVERY_REQUIRED
    val station: StationAccessReport.Type = StationAccessReport.RECOVERY_REQUIRED
    api.put_pilotReport(pilot)
    api.put_stationReport(station)
  }

  def finalise(api: LifecycleReporter_Operational_Api): Unit = { }
}
