// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RequestAcquisition_cargo_coordination_process_request_acquisition {

  def initialise(api: RequestAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_facts(Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts.example())
  }

  def timeTriggered(api: RequestAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_transfer_request: Option[Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type] = api.get_transfer_request()
    api.logInfo(s"Received on data port transfer_request: ${apiUsage_transfer_request}")
  }

  def finalise(api: RequestAcquisition_Operational_Api): Unit = { }
}
