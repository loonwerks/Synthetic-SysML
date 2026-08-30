// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8b1ae078a82a_3_Valid {
  @pure def check(
      access_request: equiv_shared_0.Docking_Access_Supervisor.AccessRequest.Type,
      request_facts: equiv_shared_0.Docking_Access_Supervisor.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
