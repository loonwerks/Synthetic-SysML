// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_639ec7354bd5_4_Valid {
  @pure def check(
      applied_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot,
      authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      control_frame: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_GumboX.inititialize_IEP_Post(control_frame))) ___>: (T)) & T))
  }
}
