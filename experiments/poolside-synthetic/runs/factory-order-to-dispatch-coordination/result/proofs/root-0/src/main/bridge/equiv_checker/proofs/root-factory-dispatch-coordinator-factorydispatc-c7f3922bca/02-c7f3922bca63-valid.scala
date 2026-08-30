// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c7f3922bca63_2_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      prior_order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      retained_order: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_GumboX.inititialize_IEP_Post(retained_order, order_state, prior_order_state))) & T))
  }
}
