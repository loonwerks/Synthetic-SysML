// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_51c10fad92d1_4_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition,
      phase_report: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      qualified_request: equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Type,
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      in_current_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      current_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      in_recovery_required: B,
      recovery_required: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_GumboX.compute_CEP_Post(in_current_phase, in_recovery_required, current_phase, recovery_required, battery_assessment, qualified_request, decision_disposition, phase_report, selected_phase))) ___>: (T)) & T))
  }
}
