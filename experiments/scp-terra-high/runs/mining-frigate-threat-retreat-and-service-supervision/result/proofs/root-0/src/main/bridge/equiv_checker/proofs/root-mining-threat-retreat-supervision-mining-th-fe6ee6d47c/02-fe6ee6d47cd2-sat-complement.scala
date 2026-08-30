// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fe6ee6d47cd2_2_Complement {
  @pure def check(
      next_recovery_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue,
      public_result: equiv_shared_0.Mining_Threat_Retreat_Supervision.PublicResultValue,
      selected_action: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionValue,
      selected_cause: equiv_shared_0.Mining_Threat_Retreat_Supervision.SelectedCauseValue): Unit = {
    Contract(Requires(!((((equiv_shared_0.Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_GumboX.compute_CEP_Pre(next_recovery_state, selected_action, selected_cause)) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_Candidate_GumboX.compute_CEP_Post(next_recovery_state, selected_action, selected_cause, public_result))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_GumboX.compute_CEP_Post(next_recovery_state, selected_action, selected_cause, public_result))) & T)))
  }
}
