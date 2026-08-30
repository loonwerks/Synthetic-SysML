// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RequestAdmission_cargo_coordination_process_request_admission {

  def initialise(api: RequestAdmission_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admission_decision(Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision.example())
    api.put_request_disposition(Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.NO_REQUEST)
  }

  def timeTriggered(api: RequestAdmission_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_facts: Option[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts] = api.get_request_facts()
    api.logInfo(s"Received on data port request_facts: ${apiUsage_request_facts}")
    val apiUsage_dock_facts: Option[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts] = api.get_dock_facts()
    api.logInfo(s"Received on data port dock_facts: ${apiUsage_dock_facts}")
    val apiUsage_prior_session_view: Option[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView] = api.get_prior_session_view()
    api.logInfo(s"Received on data port prior_session_view: ${apiUsage_prior_session_view}")
    val apiUsage_coordination_guard: Option[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard] = api.get_coordination_guard()
    api.logInfo(s"Received on data port coordination_guard: ${apiUsage_coordination_guard}")
  }

  def finalise(api: RequestAdmission_Operational_Api): Unit = { }
}
