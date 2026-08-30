// #Sireum

package scp_candidate.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SessionController_supervisorProcess_sessionController {

  // BEGIN STATE VARS
  var sessionState: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type = Station_Cargo_Transfer_Verification_Supervisor.SessionState.Idle
  // END STATE VARS

  def initialise(api: SessionController_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionPrestate(Station_Cargo_Transfer_Verification_Supervisor.SessionState.Idle)
    api.put_shipExpectation(Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.None)
    api.put_warehouseExpectation(Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.None)
    api.put_commandProposal(Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.HoldNoQuery)
    api.put_sessionSnapshot(Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot(
      Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Idle,
      Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.None))
  }

  def timeTriggered(api: SessionController_Operational_Api): Unit = { }
  def finalise(api: SessionController_Operational_Api): Unit = { }
}
