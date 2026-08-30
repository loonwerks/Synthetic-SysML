// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_333abed12f5e_Candidate_Pointwise_Realizable {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T))))
  }
}
