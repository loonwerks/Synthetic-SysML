// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_08938426cacb_2_Valid {
  @pure def check(
      control_event: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type,
      coordination_frame: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame,
      coordination_guard: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard,
      prior_recovery_state: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type,
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      prior_warehouse_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      priority_directive: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective,
      recovery_transition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition,
      ship_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts,
      ship_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type,
      warehouse_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts,
      warehouse_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_GumboX.inititialize_IEP_Post(coordination_frame, coordination_guard, priority_directive, recovery_transition, ship_update, warehouse_update))) & T))
  }
}
