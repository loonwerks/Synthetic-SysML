// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_31251e909b82_2_Complement {
  @pure def check(
      public_result: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchPublicResult,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type,
      status_record: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_GumboX.compute_CEP_Post(request_facts, selected_action, status_record, public_result))) & T)))
  }
}
