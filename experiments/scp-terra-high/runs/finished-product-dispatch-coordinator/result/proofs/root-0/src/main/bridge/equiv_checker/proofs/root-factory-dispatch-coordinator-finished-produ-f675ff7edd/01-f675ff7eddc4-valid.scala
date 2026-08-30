// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f675ff7eddc4_1_Valid {
  @pure def check(
      decision_reason: equiv_shared_0.Factory_Dispatch_Coordinator.Decision_Reason.Type,
      dispatch_status: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Type,
      lifecycle_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
