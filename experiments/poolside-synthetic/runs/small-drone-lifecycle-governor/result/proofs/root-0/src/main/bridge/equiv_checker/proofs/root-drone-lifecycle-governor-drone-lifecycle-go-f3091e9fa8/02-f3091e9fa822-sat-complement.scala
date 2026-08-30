// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3091e9fa822_2_Complement {
  @pure def check(
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition,
      phase_report: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      qualified_request: equiv_shared_0.Drone_Lifecycle_Governor.Qualified_Request.Type,
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      current_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type,
      recovery_required: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_GumboX.inititialize_IEP_Post(current_phase, recovery_required, decision_disposition, phase_report, selected_phase))) & T)))
  }
}
