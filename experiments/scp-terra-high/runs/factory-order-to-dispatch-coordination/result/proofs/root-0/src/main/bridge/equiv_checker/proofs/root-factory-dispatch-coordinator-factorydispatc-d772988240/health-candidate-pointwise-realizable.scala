// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d772988240a7_Candidate_Pointwise_Realizable {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts,
      supplier_available: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_Candidate_GumboX.compute_CEP_Post(order_state, recovery_gate, stock_facts, supplier_available, equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_Candidate_GumboX.compute_CEP_Post(order_state, recovery_gate, stock_facts, supplier_available, equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.PROPOSED)))))
  }
}
