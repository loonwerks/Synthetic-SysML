// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c1c2cf397a5_1_Valid {
  @pure def check(
      qualified_request: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Type,
      raw_request: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
