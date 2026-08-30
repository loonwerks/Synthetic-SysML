// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_c7f3922bca63_Oracle_Pointwise_Realizable {
  @pure def check(
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.IDLE, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN, equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.OPEN)))))
  }
}
