// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_31251e909b82_1_Valid {
  @pure def check(
      public_result: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchPublicResult,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type,
      status_record: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
