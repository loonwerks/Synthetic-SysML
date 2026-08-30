// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_250ff363662c_2_Valid {
  @pure def check(
      confirmation_context: equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Context,
      execution_context: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Execution_Context,
      execution_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Execution_Outcome,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      transition_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_GumboX.inititialize_IEP_Post(confirmation_context, recovery_plan, transition_plan))) & T))
  }
}
