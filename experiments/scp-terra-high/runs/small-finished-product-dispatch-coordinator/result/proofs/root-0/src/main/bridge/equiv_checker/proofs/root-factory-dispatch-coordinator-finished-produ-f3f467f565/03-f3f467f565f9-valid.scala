// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3f467f565f9_3_Valid {
  @pure def check(
      qualified_request: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Type,
      raw_request: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
