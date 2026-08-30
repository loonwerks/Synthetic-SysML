// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_909def6255a6_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      request_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
