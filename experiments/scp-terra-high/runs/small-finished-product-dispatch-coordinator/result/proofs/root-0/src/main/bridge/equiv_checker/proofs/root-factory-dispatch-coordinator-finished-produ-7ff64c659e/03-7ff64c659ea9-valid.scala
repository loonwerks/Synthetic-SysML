// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7ff64c659ea9_3_Valid {
  @pure def check(
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Type,
      raw_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
