// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1c491e176c6e_Oracle_Assumption_Satisfiable {
  @pure def check(
      arrival_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Arrival_Fact,
      defense_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Facts,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      threat_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_GumboX.compute_CEP_Pre(arrival_fact, defense_facts, phase_context, threat_fact)))
  }
}
