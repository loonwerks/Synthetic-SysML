// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7230e4c3d462_1_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      ship_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type,
      shipevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
