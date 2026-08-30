// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d772988240a7_3_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts,
      supplier_available: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
