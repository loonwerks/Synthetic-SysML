// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3bdb481e5a55_2_Valid {
  @pure def check(
      authorization_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      authorization_to_outcome: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      brake_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      health_qualification: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      power_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      request_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_GumboX.compute_CEP_Post(brake_facts, health_qualification, power_facts, request_facts, authorization_to_lifecycle, authorization_to_outcome))) & T))
  }
}
