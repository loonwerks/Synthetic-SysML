// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2acfbe8c61fe_4_Valid {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      defensereadyout: B,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_GumboX.compute_CEP_Post(defensegatein, readinesscontextin, defensereadyout))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_Candidate_GumboX.compute_CEP_Post(defensegatein, readinesscontextin, defensereadyout))) & T))
  }
}
