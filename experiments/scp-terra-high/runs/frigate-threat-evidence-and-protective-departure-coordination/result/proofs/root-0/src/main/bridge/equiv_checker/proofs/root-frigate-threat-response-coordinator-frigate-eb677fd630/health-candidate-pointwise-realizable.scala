// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_eb677fd63001_Candidate_Pointwise_Realizable {
  @pure def check(
      defenseproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      escapeproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_Candidate_GumboX.compute_CEP_Post(defenseproposalin, escapeproposalin, equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponsePattern.OBSERVE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_Candidate_GumboX.compute_CEP_Post(defenseproposalin, escapeproposalin, equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponsePattern.DEFENSE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_Candidate_GumboX.compute_CEP_Post(defenseproposalin, escapeproposalin, equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponsePattern.DEPARTURE)))))
  }
}
