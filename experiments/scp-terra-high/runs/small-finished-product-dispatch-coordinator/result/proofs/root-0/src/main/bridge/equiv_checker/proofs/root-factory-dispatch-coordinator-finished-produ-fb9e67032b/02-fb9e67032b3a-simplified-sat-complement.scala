// #Sireum #Logika
package equiv_checker.generated

import org.sireum._

object VC_fb9e67032b3a_2_Simplified_Complement {
  @pure def check(
      availability_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type,
      notice_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Type,
      qualified_request: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Type,
      release_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      in_current_phase: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Phase.Type,
      current_phase: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Phase.Type,
      in_recovery_required: B,
      recovery_required: B): Unit = {
    Contract(Requires(!((equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_Candidate_GumboX.compute_CEP_Post(in_current_phase, in_recovery_required, current_phase, recovery_required, availability_assessment, qualified_outcome, qualified_request, notice_resolution, release_resolution)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_GumboX.compute_CEP_Post(in_current_phase, in_recovery_required, current_phase, recovery_required, availability_assessment, qualified_outcome, qualified_request, notice_resolution, release_resolution)))))
  }
}
