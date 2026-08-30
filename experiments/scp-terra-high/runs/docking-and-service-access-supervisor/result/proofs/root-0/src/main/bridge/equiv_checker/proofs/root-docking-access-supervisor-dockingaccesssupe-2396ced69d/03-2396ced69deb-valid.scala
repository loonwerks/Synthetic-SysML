// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2396ced69deb_3_Valid {
  @pure def check(
      access_request: equiv_shared_0.Docking_Access_Supervisor.AccessRequest.Type,
      request_facts: equiv_shared_0.Docking_Access_Supervisor.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
