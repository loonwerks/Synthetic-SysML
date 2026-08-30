// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle {

  def initialise(api: WarehouseEvidenceLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_warehouse_evidence(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.CLEAR)
  }

  def timeTriggered(api: WarehouseEvidenceLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_warehouse_update: Option[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type] = api.get_warehouse_update()
    api.logInfo(s"Received on data port warehouse_update: ${apiUsage_warehouse_update}")
    val apiUsage_admission_decision: Option[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision] = api.get_admission_decision()
    api.logInfo(s"Received on data port admission_decision: ${apiUsage_admission_decision}")
  }

  def finalise(api: WarehouseEvidenceLifecycle_Operational_Api): Unit = { }
}
