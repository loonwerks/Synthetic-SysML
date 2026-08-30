// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration {

  def initialise(api: TransferActionArbitration_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_transfer_decision(Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision.example())
  }

  def timeTriggered(api: TransferActionArbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_proposal: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal] = api.get_request_proposal()
    api.logInfo(s"Received on data port request_proposal: ${apiUsage_request_proposal}")
    val apiUsage_ship_proposal: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal] = api.get_ship_proposal()
    api.logInfo(s"Received on data port ship_proposal: ${apiUsage_ship_proposal}")
    val apiUsage_warehouse_proposal: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal] = api.get_warehouse_proposal()
    api.logInfo(s"Received on data port warehouse_proposal: ${apiUsage_warehouse_proposal}")
    val apiUsage_priority_directive: Option[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective] = api.get_priority_directive()
    api.logInfo(s"Received on data port priority_directive: ${apiUsage_priority_directive}")
  }

  def finalise(api: TransferActionArbitration_Operational_Api): Unit = { }
}
