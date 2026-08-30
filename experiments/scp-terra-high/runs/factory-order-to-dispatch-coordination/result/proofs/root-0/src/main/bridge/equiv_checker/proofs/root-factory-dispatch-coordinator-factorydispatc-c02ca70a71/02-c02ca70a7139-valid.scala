// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c02ca70a7139_2_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      recovery_state: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type,
      status_record: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_Candidate_GumboX.compute_CEP_Post(order_state, recovery_state, selected_action, status_record))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_GumboX.compute_CEP_Post(order_state, recovery_state, selected_action, status_record))) & T))
  }
}
