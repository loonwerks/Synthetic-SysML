// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bcc5587228d0_3_Valid {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapeproposaltocompositionout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapeproposaltocoordinationout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
