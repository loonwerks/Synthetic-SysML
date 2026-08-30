// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_423086697691_4_Valid {
  @pure def check(
      dispatch_available: B,
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_GumboX.compute_CEP_Post(dispatch_available, order_state, recovery_gate, stock_facts, proposal))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_Candidate_GumboX.compute_CEP_Post(dispatch_available, order_state, recovery_gate, stock_facts, proposal))) & T))
  }
}
