// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_35a3e431b798_1_Valid {
  @pure def check(
      execution_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.ExecutionOutcome.Type,
      outcome_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
