// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9c4d0ee030b7_3_Valid {
  @pure def check(
      brake_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type,
      brake_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      brake_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
