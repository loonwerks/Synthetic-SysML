// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dedb8a772152_2_Complement {
  @pure def check(
      defense_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Facts,
      mining_recovery_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts,
      raw_resources: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation,
      resource_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Invalidity,
      resource_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts): Unit = {
    Contract(Requires(!((((equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_GumboX.compute_CEP_Pre(raw_resources)) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_GumboX.compute_CEP_Post(raw_resources, defense_facts, mining_recovery_facts, resource_invalidity, resource_publication))) & T)))
  }
}
