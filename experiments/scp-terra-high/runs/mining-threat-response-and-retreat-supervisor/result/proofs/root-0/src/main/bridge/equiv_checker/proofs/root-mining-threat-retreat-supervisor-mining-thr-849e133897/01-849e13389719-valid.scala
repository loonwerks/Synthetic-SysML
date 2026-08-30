// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_849e13389719_1_Valid {
  @pure def check(
      mission_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Facts,
      mission_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Proposal,
      phase_context: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context,
      resource_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts,
      threat_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
