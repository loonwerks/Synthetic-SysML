// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_df1150be3815_2_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      selected_intent: equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_GumboX.compute_CEP_Post(admission, recovery_plan, selected_intent))) & T))
  }
}
