// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_81d915a79807_2_Valid {
  @pure def check(
      defense_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Facts,
      mining_recovery_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts,
      raw_resources: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation,
      resource_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Invalidity,
      resource_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_GumboX.inititialize_IEP_Post(defense_facts, mining_recovery_facts, resource_invalidity, resource_publication))) & T))
  }
}
