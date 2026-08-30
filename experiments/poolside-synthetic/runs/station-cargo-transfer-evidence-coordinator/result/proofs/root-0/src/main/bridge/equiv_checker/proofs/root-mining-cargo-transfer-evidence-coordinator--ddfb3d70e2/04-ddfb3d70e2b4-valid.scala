// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ddfb3d70e2b4_4_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      prior_warehouse_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      warehouse_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type,
      in_warehouseevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      warehouseevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_GumboX.compute_CEP_Post(in_warehouseevidencestate, warehouseevidencestate, admission_decision, warehouse_update, prior_warehouse_evidence))) ___>: (T)) & T))
  }
}
