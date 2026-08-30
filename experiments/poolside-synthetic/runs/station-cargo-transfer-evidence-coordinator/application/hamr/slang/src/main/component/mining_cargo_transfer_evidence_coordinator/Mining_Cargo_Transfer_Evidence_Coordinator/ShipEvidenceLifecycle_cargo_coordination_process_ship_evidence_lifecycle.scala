// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle {

  def initialise(api: ShipEvidenceLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_ship_evidence(Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.CLEAR)
  }

  def timeTriggered(api: ShipEvidenceLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_ship_update: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type] = api.get_ship_update()
    api.logInfo(s"Received on data port ship_update: ${apiUsage_ship_update}")
    val apiUsage_admission_decision: Option[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision] = api.get_admission_decision()
    api.logInfo(s"Received on data port admission_decision: ${apiUsage_admission_decision}")
  }

  def finalise(api: ShipEvidenceLifecycle_Operational_Api): Unit = { }
}
