// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c87c9e19ea7_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      request_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
