// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_268f619c45f3_1_Valid {
  @pure def check(
      fresh_request: equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.Type,
      request_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
