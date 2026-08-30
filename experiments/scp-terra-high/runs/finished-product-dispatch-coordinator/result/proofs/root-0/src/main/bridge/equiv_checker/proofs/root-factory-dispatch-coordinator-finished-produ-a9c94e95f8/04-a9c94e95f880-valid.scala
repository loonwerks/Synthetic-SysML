// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a9c94e95f880_4_Valid {
  @pure def check(
      decision_reason: equiv_shared_0.Factory_Dispatch_Coordinator.Decision_Reason.Type,
      dispatch_status: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Type,
      lifecycle_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(dispatch_status))) ___>: (T)) & T))
  }
}
