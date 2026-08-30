// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9647c786cae5_1_Valid {
  @pure def check(
      dock_context: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type,
      dock_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
