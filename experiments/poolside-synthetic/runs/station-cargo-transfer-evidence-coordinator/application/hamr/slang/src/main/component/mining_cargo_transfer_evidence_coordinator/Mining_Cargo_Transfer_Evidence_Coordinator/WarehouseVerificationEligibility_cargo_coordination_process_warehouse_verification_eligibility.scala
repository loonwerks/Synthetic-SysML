// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility {

  def initialise(api: WarehouseVerificationEligibility_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_warehouse_proposal(Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal.example())
  }

  def timeTriggered(api: WarehouseVerificationEligibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_prior_session_view: Option[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView] = api.get_prior_session_view()
    api.logInfo(s"Received on data port prior_session_view: ${apiUsage_prior_session_view}")
    val apiUsage_prior_ship_evidence: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type] = api.get_prior_ship_evidence()
    api.logInfo(s"Received on data port prior_ship_evidence: ${apiUsage_prior_ship_evidence}")
    val apiUsage_prior_warehouse_evidence: Option[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type] = api.get_prior_warehouse_evidence()
    api.logInfo(s"Received on data port prior_warehouse_evidence: ${apiUsage_prior_warehouse_evidence}")
  }

  def finalise(api: WarehouseVerificationEligibility_Operational_Api): Unit = { }
}
