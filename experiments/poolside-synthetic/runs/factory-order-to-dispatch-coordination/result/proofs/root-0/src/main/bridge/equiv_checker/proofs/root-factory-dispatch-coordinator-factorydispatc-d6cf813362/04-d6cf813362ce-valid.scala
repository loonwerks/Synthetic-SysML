// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d6cf813362ce_4_Valid {
  @pure def check(
      public_result: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchPublicResult,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type,
      status_record: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_GumboX.inititialize_IEP_Post(public_result))) ___>: (T)) & T))
  }
}
