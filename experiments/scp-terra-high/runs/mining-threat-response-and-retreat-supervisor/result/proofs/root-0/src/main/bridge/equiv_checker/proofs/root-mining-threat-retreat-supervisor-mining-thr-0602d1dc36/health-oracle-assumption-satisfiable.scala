// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0602d1dc3663_Oracle_Assumption_Satisfiable {
  @pure def check(
      mission_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Facts,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      resource_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts,
      threat_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_GumboX.compute_CEP_Pre(mission_facts, phase_context, resource_facts, threat_fact)))
  }
}
