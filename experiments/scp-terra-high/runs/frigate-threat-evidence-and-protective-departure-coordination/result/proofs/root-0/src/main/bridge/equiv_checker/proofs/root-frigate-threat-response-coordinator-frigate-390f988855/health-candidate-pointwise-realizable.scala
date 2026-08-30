// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_390f9888553f_Candidate_Pointwise_Realizable {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.STAY, equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.STAY, equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.DEPART)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.DEPART, equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.DEPART, equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.DEPART)))))
  }
}
