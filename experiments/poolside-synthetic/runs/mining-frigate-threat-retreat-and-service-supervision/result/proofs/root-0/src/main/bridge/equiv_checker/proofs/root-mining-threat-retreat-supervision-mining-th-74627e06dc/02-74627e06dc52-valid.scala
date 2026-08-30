// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_74627e06dc52_2_Valid {
  @pure def check(
      defense_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      emergency_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue,
      mining_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      mobility_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.MobilityProposalValue,
      selected_action: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionValue,
      selected_cause: equiv_shared_0.Mining_Threat_Retreat_Supervision.SelectedCauseValue): Unit = {
    Contract(Requires(T),
      Ensures((((equiv_shared_0.Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_GumboX.compute_CEP_Pre(defense_proposal, emergency_state, mining_proposal, mobility_proposal)) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_GumboX.compute_CEP_Post(defense_proposal, emergency_state, mining_proposal, mobility_proposal, selected_action, selected_cause))) & T))
  }
}
