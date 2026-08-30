// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fabd4309743c_2_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      production_available: B,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_Candidate_GumboX.compute_CEP_Post(order_state, production_available, recovery_gate, stock_facts, proposal))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_GumboX.compute_CEP_Post(order_state, production_available, recovery_gate, stock_facts, proposal))) & T))
  }
}
