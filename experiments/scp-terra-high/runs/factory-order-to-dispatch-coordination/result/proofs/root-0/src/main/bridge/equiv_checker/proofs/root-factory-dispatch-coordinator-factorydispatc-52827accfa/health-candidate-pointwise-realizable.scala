// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_52827accfa0f_Candidate_Pointwise_Realizable {
  @pure def check(
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      in_retained_order: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_Candidate_GumboX.compute_CEP_Post(in_retained_order, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, qualified_outcome, recovery_gate, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)))))
  }
}
