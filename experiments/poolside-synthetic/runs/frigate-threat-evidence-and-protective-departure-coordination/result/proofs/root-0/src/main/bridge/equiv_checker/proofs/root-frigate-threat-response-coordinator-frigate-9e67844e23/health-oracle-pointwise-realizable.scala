// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_9e67844e2361_Oracle_Pointwise_Realizable {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defenseauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseAuthority.Type,
      defensereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE)))))
  }
}
