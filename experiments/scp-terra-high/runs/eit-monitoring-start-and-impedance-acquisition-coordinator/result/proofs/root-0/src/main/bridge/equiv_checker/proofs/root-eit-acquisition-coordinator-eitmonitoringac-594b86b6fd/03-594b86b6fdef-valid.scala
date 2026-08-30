// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_594b86b6fdef_3_Valid {
  @pure def check(
      qualifiedrequest: equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.Type,
      requestsample: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringRequestSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
