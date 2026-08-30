// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bcd3e24d7913_2_Valid {
  @pure def check(
      authorization_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      authorization_to_outcome: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      brake_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      health_qualification: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      power_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      request_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_Candidate_GumboX.inititialize_IEP_Post(authorization_to_lifecycle, authorization_to_outcome))) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_GumboX.inititialize_IEP_Post(authorization_to_lifecycle, authorization_to_outcome))) & T))
  }
}
