// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bcc5587228d0_2_Complement {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapeproposaltocompositionout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapeproposaltocoordinationout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapereadyin: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_GumboX.compute_CEP_Post(alertstatein, escapeauthorityin, escapereadyin, escapeproposaltocompositionout, escapeproposaltocoordinationout))) & T)))
  }
}
