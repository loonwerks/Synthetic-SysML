// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e9973fe5c804_2_Complement {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      production_available: B,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_GumboX.inititialize_IEP_Post(proposal))) & T)))
  }
}
