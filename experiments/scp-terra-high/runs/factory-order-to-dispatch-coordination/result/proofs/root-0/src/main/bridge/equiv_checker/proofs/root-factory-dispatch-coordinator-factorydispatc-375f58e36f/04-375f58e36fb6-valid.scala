// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_375f58e36fb6_4_Valid {
  @pure def check(
      order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      recovery_state: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type,
      status_record: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_GumboX.inititialize_IEP_Post(status_record))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_Candidate_GumboX.inititialize_IEP_Post(status_record))) & T))
  }
}
