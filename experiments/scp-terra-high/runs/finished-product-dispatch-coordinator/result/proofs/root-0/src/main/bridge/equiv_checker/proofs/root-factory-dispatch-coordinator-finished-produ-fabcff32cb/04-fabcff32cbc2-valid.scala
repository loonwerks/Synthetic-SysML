// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fabcff32cbc2_4_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      selected_intent: equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_GumboX.inititialize_IEP_Post(selected_intent))) ___>: (T)) & T))
  }
}
