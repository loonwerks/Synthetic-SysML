// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_381e4ec26303_2_Complement {
  @pure def check(
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      prior_warehouse_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type,
      warehouse_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_GumboX.inititialize_IEP_Post(warehouse_proposal))) & T)))
  }
}
