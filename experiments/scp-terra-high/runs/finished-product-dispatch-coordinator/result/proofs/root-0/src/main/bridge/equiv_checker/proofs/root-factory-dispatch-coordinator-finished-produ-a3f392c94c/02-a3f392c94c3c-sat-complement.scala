// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a3f392c94c3c_2_Complement {
  @pure def check(
      confirmation_context: equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Context,
      execution_context: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Execution_Context,
      execution_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Execution_Outcome,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      transition_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_GumboX.compute_CEP_Post(execution_context, execution_outcome, confirmation_context, recovery_plan, transition_plan))) & T)))
  }
}
