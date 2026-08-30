// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4dee0fbf2353_4_Valid {
  @pure def check(
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      prior_ship_evidence: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type,
      ship_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_GumboX.inititialize_IEP_Post(ship_proposal))) ___>: (T)) & T))
  }
}
