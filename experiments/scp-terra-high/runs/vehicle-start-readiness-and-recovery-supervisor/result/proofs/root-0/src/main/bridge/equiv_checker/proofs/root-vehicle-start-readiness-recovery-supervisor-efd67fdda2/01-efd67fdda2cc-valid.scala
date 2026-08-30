// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_efd67fdda2cc_1_Valid {
  @pure def check(
      request_levels: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels,
      request_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      request_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      previousoff: B,
      previousreturn: B,
      previousstart: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
