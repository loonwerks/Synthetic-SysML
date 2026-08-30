// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0bb6327170e9_2_Complement {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts,
      supplier_available: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_GumboX.inititialize_IEP_Post(proposal))) & T)))
  }
}
