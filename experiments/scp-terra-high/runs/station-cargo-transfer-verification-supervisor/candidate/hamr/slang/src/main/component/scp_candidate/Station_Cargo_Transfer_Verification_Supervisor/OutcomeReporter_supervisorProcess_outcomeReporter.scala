// #Sireum

package scp_candidate.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeReporter_supervisorProcess_outcomeReporter {

  def initialise(api: OutcomeReporter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REPORT_INITIAL
        api.pilotReport == PilotTransferReport.Idle &&
          api.stationReport == StationTransferReport.Idle
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotReport(Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Idle)
    api.put_stationReport(Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Idle)
  }

  def timeTriggered(api: OutcomeReporter_Operational_Api): Unit = { }
  def finalise(api: OutcomeReporter_Operational_Api): Unit = { }
}
