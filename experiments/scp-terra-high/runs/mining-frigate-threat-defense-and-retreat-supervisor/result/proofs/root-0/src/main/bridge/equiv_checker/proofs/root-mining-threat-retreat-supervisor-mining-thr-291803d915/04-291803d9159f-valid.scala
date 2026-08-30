// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_291803d9159f_4_Valid {
  @pure def check(
      qualified_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Observation,
      raw_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Observation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_GumboX.compute_CEP_Post(raw_threat, qualified_threat))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_Candidate_GumboX.compute_CEP_Post(raw_threat, qualified_threat))) & T))
  }
}
