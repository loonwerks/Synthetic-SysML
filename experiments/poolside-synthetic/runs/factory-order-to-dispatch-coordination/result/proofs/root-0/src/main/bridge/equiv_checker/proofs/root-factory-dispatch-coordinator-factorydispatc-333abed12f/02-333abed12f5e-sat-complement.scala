// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_333abed12f5e_2_Complement {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_GumboX.compute_CEP_Post(order_state, recovery_gate, request_facts, proposal))) & T)))
  }
}
