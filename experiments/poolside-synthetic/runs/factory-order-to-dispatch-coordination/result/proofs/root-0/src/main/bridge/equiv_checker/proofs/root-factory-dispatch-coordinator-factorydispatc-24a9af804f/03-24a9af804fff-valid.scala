// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_24a9af804fff_3_Valid {
  @pure def check(
      dispatch_available: B,
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
