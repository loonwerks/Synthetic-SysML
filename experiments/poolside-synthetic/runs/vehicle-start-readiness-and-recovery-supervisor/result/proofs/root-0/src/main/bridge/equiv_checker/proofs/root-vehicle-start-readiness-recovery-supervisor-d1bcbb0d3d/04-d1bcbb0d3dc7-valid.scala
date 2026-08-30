// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d1bcbb0d3dc7_4_Valid {
  @pure def check(
      applied_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot,
      authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      control_frame: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_GumboX.compute_CEP_Post(applied_lifecycle, authorization, control_frame))) ___>: (T)) & T))
  }
}
