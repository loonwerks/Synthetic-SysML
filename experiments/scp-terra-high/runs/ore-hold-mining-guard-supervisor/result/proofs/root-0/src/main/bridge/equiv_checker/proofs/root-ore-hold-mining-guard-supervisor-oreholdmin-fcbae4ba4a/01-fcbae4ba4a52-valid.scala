// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fcbae4ba4a52_1_Valid {
  @pure def check(
      pilot_request: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample,
      request_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.RequestAssessment,
      in_previoushalt: B,
      previoushalt: B,
      in_previousresume: B,
      previousresume: B,
      in_previousstart: B,
      previousstart: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
