// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2194303bbf8e_2_Complement {
  @pure def check(
      health_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation,
      health_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      health_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_GumboX.compute_CEP_Post(health_observation, health_to_authorization, health_to_lifecycle))) & T)))
  }
}
