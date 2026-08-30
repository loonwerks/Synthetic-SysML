// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7b8cbb681536_4_Valid {
  @pure def check(
      qualified_request: equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Type,
      raw_request: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_GumboX.inititialize_IEP_Post(qualified_request))) ___>: (T)) & T))
  }
}
