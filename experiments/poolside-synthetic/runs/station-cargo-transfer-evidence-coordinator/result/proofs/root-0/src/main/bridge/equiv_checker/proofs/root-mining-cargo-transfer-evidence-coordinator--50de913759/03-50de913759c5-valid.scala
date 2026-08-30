// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_50de913759c5_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      ship_update: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type,
      in_shipevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      shipevidencestate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
