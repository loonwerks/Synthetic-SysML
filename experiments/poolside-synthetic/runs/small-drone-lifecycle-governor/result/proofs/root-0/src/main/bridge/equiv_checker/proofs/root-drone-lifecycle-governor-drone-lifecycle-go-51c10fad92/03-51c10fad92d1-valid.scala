// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_51c10fad92d1_3_Valid {
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
      Ensures((T) ___>: (T)))
  }
}
