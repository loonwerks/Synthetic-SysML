// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fcbae4ba4a52_4_Valid {
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
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_GumboX.compute_CEP_Post(in_previoushalt, in_previousresume, in_previousstart, previoushalt, previousresume, previousstart, pilot_request, request_assessment))) ___>: (T)) & T))
  }
}
