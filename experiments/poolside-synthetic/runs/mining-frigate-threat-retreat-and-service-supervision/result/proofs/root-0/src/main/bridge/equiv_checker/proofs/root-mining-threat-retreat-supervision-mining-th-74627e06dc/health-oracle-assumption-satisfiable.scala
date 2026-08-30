// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_74627e06dc52_Oracle_Assumption_Satisfiable {
  @pure def check(
      defense_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      emergency_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue,
      mining_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      mobility_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.MobilityProposalValue): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_GumboX.compute_CEP_Pre(defense_proposal, emergency_state, mining_proposal, mobility_proposal)))
  }
}
