// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_86c7512491e3_3_Valid {
  @pure def check(
      outcome_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeBoundaryFacts,
      prior_order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
