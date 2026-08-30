// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6221b9dcb548_1_Valid {
  @pure def check(
      request_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
