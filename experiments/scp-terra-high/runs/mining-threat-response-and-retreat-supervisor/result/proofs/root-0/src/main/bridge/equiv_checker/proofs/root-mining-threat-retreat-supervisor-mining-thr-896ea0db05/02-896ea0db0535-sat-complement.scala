// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_896ea0db0535_2_Complement {
  @pure def check(
      qualified_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat,
      raw_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation,
      streak_state: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_State_Input,
      threat_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Invalidity,
      threat_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts,
      owned_valid_streak: S32): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_GumboX.inititialize_IEP_Post(owned_valid_streak, qualified_threat, threat_invalidity, threat_publication))) & T)))
  }
}
