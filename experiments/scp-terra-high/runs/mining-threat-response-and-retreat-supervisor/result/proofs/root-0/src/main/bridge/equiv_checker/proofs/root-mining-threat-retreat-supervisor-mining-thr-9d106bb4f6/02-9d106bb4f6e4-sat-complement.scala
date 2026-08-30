// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9d106bb4f6e4_2_Complement {
  @pure def check(
      arrival_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Arrival_Fact,
      defense_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Facts,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      response_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Response_Proposal,
      threat_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_GumboX.inititialize_IEP_Post(response_proposal))) & T)))
  }
}
