// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_787160774591_2_Valid {
  @pure def check(
      health_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation,
      health_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      health_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_Candidate_GumboX.inititialize_IEP_Post(health_to_authorization, health_to_lifecycle))) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_GumboX.inititialize_IEP_Post(health_to_authorization, health_to_lifecycle))) & T))
  }
}
