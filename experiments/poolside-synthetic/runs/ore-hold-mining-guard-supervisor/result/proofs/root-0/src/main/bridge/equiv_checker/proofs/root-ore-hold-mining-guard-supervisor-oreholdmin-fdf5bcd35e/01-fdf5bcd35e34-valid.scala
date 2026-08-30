// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fdf5bcd35e34_1_Valid {
  @pure def check(
      pilot_request: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample,
      request_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.RequestAssessment,
      previoushalt: B,
      previousresume: B,
      previousstart: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
