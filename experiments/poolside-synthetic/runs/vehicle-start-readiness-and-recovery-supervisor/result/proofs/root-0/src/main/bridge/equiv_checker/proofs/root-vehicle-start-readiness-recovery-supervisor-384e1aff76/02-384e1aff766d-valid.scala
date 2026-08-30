// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_384e1aff766d_2_Valid {
  @pure def check(
      power_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type,
      power_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      power_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_GumboX.inititialize_IEP_Post(power_to_authorization, power_to_lifecycle))) & T))
  }
}
