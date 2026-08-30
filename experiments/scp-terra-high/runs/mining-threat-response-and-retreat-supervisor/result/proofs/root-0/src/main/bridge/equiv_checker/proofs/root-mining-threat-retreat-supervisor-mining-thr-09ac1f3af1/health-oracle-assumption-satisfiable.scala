// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_09ac1f3af103_Oracle_Assumption_Satisfiable {
  @pure def check(
      in_owned_phase: S32,
      fault: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Fact,
      mission_candidate: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Proposal,
      phase_state: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_State_Input,
      resource_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts,
      response_candidate: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Response_Proposal,
      threat_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_GumboX.compute_CEP_Pre(in_owned_phase, fault, mission_candidate, phase_state, resource_publication, response_candidate, threat_publication)))
  }
}
