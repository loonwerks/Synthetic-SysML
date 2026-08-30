// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b36a7ce81672_4_Valid {
  @pure def check(
      brake_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type,
      brake_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      brake_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_GumboX.inititialize_IEP_Post(brake_to_authorization, brake_to_lifecycle))) ___>: (T)) & T))
  }
}
