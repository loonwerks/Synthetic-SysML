// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c87c9e19ea7_2_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      request_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_GumboX.compute_CEP_Post(admission_decision, request_proposal))) & T))
  }
}
