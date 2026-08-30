// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a3f392c94c3c_1_Valid {
  @pure def check(
      confirmation_context: equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Context,
      execution_context: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Execution_Context,
      execution_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Execution_Outcome,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      transition_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
