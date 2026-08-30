// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b25aad9656d_3_Valid {
  @pure def check(
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      ship_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
