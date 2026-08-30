// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_eaccc47d8c5d_Oracle_Assumption_Satisfiable {
  @pure def check(
      in_owned_valid_streak: S32,
      raw_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation,
      streak_state: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_State_Input): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_GumboX.compute_CEP_Pre(in_owned_valid_streak, raw_threat, streak_state)))
  }
}
