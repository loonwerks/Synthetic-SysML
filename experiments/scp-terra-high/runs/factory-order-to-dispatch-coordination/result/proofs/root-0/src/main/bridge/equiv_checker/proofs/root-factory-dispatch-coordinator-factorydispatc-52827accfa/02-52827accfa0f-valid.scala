// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_52827accfa0f_2_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      prior_order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      in_retained_order: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      retained_order: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, retained_order, qualified_outcome, recovery_gate, order_state, prior_order_state))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.compute_CEP_Post(in_retained_order, retained_order, qualified_outcome, recovery_gate, order_state, prior_order_state))) & T))
  }
}
