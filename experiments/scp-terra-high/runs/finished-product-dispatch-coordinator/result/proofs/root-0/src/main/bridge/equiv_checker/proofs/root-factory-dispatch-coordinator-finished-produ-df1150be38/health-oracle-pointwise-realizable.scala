// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_df1150be3815_Oracle_Pointwise_Realizable {
  @pure def check(
      admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_GumboX.compute_CEP_Post(admission, recovery_plan, equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.None)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_GumboX.compute_CEP_Post(admission, recovery_plan, equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.FreshIntent)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_GumboX.compute_CEP_Post(admission, recovery_plan, equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.RecoveryIntent)))))
  }
}
