// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object EvidenceCoherence_cargo_coordination_process_evidence_coherence {

  def initialise(api: EvidenceCoherence_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_transition(Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition.example())
    api.put_coordination_guard(Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard.example())
    api.put_coordination_frame(Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame.example())
    api.put_ship_update(Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.FREEZE)
    api.put_warehouse_update(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.FREEZE)
    api.put_priority_directive(Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective.example())
  }

  def timeTriggered(api: EvidenceCoherence_Operational_Api): Unit = {
    // example api usage

    val apiUsage_ship_report_facts: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts] = api.get_ship_report_facts()
    api.logInfo(s"Received on data port ship_report_facts: ${apiUsage_ship_report_facts}")
    val apiUsage_warehouse_report_facts: Option[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts] = api.get_warehouse_report_facts()
    api.logInfo(s"Received on data port warehouse_report_facts: ${apiUsage_warehouse_report_facts}")
    val apiUsage_control_event: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type] = api.get_control_event()
    api.logInfo(s"Received on data port control_event: ${apiUsage_control_event}")
    val apiUsage_prior_recovery_state: Option[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type] = api.get_prior_recovery_state()
    api.logInfo(s"Received on data port prior_recovery_state: ${apiUsage_prior_recovery_state}")
    val apiUsage_prior_session_view: Option[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView] = api.get_prior_session_view()
    api.logInfo(s"Received on data port prior_session_view: ${apiUsage_prior_session_view}")
    val apiUsage_prior_ship_evidence: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type] = api.get_prior_ship_evidence()
    api.logInfo(s"Received on data port prior_ship_evidence: ${apiUsage_prior_ship_evidence}")
    val apiUsage_prior_warehouse_evidence: Option[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type] = api.get_prior_warehouse_evidence()
    api.logInfo(s"Received on data port prior_warehouse_evidence: ${apiUsage_prior_warehouse_evidence}")
  }

  def finalise(api: EvidenceCoherence_Operational_Api): Unit = { }
}
