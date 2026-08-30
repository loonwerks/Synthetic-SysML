// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object TransferSession_cargo_coordination_process_transfer_session {

  def initialise(api: TransferSession_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_session_view(Mining_Cargo_Transfer_Evidence_Coordinator.SessionView.example())
  }

  def timeTriggered(api: TransferSession_Operational_Api): Unit = {
    // example api usage

    val apiUsage_admission_decision: Option[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision] = api.get_admission_decision()
    api.logInfo(s"Received on data port admission_decision: ${apiUsage_admission_decision}")
    val apiUsage_coordination_frame: Option[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame] = api.get_coordination_frame()
    api.logInfo(s"Received on data port coordination_frame: ${apiUsage_coordination_frame}")
  }

  def finalise(api: TransferSession_Operational_Api): Unit = { }
}
