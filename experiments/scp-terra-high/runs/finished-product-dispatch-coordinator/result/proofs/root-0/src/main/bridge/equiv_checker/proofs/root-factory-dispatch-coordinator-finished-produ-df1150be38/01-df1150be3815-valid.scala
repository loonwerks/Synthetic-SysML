// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_df1150be3815_1_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      recovery_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      selected_intent: equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
