// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_507e91f63fa8_2_Valid {
  @pure def check(
      qualified_request: equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Type,
      raw_request: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.compute_CEP_Post(raw_request, qualified_request))) & T))
  }
}
