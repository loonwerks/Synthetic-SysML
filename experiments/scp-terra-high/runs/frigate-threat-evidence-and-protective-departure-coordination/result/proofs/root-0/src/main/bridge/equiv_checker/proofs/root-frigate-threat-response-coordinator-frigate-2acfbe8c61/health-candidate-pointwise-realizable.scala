// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_2acfbe8c61fe_Candidate_Pointwise_Realizable {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_Candidate_GumboX.compute_CEP_Post(defensegatein, readinesscontextin, F)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_Candidate_GumboX.compute_CEP_Post(defensegatein, readinesscontextin, T)))))
  }
}
