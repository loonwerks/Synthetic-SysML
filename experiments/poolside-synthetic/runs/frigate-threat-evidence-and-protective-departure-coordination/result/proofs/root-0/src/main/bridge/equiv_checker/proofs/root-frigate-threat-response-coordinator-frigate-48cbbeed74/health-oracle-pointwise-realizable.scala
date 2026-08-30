// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_48cbbeed747f_Oracle_Pointwise_Realizable {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defenseauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseAuthority.Type,
      defensereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.compute_CEP_Post(alertstatein, defenseauthorityin, defensereadyin, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.compute_CEP_Post(alertstatein, defenseauthorityin, defensereadyin, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.compute_CEP_Post(alertstatein, defenseauthorityin, defensereadyin, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_GumboX.compute_CEP_Post(alertstatein, defenseauthorityin, defensereadyin, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE)))))
  }
}
