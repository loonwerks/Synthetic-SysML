// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_925e28786e8f_2_Complement {
  @pure def check(
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      prior_warehouse_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      warehouse_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_GumboX.compute_CEP_Post(prior_session_view, prior_ship_evidence, prior_warehouse_evidence, warehouse_proposal))) & T)))
  }
}
