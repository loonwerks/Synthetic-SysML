// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ResultComposition_cargo_coordination_process_result_composition {

  def initialise(api: ResultComposition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_transfer_result(Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult.example())
  }

  def timeTriggered(api: ResultComposition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_transfer_decision: Option[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision] = api.get_transfer_decision()
    api.logInfo(s"Received on data port transfer_decision: ${apiUsage_transfer_decision}")
    val apiUsage_request_disposition: Option[Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type] = api.get_request_disposition()
    api.logInfo(s"Received on data port request_disposition: ${apiUsage_request_disposition}")
  }

  def finalise(api: ResultComposition_Operational_Api): Unit = { }
}
