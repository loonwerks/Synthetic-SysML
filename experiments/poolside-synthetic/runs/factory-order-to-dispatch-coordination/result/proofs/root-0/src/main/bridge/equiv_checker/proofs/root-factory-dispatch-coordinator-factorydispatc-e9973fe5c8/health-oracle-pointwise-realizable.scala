// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_e9973fe5c804_Oracle_Pointwise_Realizable {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      production_available: B,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.PROPOSED)))))
  }
}
