// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9e67844e2361_4_Valid {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defenseauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseAuthority.Type,
      defenseproposaltocompositionout: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      defenseproposaltocoordinationout: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      defensereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.inititialize_IEP_Post(defenseproposaltocompositionout, defenseproposaltocoordinationout))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_Candidate_GumboX.inititialize_IEP_Post(defenseproposaltocompositionout, defenseproposaltocoordinationout))) & T))
  }
}
