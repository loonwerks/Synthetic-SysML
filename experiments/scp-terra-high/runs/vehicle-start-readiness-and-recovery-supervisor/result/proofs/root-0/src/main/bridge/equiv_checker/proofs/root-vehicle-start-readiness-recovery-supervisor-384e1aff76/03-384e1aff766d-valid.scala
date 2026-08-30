// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_384e1aff766d_3_Valid {
  @pure def check(
      power_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type,
      power_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      power_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
