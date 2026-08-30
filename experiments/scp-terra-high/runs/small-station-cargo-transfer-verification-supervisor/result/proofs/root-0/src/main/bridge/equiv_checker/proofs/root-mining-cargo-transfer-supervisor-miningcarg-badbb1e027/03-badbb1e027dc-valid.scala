// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_badbb1e027dc_3_Valid {
  @pure def check(
      qualifiedrequest: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type,
      requestsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
