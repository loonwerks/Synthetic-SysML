// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7b8cbb681536_3_Valid {
  @pure def check(
      qualified_request: equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Type,
      raw_request: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
