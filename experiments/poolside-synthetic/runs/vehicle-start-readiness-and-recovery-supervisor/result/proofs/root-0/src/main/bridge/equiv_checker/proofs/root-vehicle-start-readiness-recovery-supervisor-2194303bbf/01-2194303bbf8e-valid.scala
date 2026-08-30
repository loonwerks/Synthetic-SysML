// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2194303bbf8e_1_Valid {
  @pure def check(
      health_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation,
      health_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      health_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
