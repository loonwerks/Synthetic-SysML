// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_423086697691_Candidate_Pointwise_Realizable {
  @pure def check(
      dispatch_available: B,
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_Candidate_GumboX.compute_CEP_Post(dispatch_available, order_state, recovery_gate, stock_facts, equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_Candidate_GumboX.compute_CEP_Post(dispatch_available, order_state, recovery_gate, stock_facts, equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.PROPOSED)))))
  }
}
