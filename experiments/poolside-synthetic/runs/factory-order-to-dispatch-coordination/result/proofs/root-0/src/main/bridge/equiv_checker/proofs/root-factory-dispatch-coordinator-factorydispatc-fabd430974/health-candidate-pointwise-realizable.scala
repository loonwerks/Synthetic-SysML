// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fabd4309743c_Candidate_Pointwise_Realizable {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      production_available: B,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T))))
  }
}
