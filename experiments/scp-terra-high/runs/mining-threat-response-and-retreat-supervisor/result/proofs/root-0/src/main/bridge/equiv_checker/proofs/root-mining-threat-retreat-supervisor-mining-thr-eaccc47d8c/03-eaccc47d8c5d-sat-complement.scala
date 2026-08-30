// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_eaccc47d8c5d_3_Complement {
  @pure def check(
      qualified_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat,
      raw_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation,
      streak_state: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_State_Input,
      threat_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Invalidity,
      threat_publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts,
      in_owned_valid_streak: S32,
      owned_valid_streak: S32): Unit = {
    Contract(Requires(!((T) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_GumboX.compute_CEP_Pre(in_owned_valid_streak, raw_threat, streak_state)))))
  }
}
