// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4ce634486f05_Candidate_Pointwise_Realizable {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_Candidate_GumboX.inititialize_IEP_Post(F)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_Candidate_GumboX.inititialize_IEP_Post(T)))))
  }
}
