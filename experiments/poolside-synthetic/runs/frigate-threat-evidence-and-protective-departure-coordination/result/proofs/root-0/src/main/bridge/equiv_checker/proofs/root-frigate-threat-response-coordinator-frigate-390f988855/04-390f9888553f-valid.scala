// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_390f9888553f_4_Valid {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapeproposaltocompositionout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapeproposaltocoordinationout: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      escapereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_GumboX.inititialize_IEP_Post(escapeproposaltocompositionout, escapeproposaltocoordinationout))) ___>: (T)) & T))
  }
}
