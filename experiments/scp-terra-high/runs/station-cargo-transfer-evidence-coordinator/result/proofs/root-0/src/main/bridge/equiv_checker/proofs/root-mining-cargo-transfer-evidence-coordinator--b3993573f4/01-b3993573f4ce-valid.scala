// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b3993573f4ce_1_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      prior_warehouse_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      warehouse_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type,
      warehouseevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
