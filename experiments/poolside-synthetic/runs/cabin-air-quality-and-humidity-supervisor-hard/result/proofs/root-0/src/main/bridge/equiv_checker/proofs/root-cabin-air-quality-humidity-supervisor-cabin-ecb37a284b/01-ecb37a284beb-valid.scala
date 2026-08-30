// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ecb37a284beb_1_Valid {
  @pure def check(
      authority: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority,
      disposition_to_composer: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type,
      disposition_to_routine: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
