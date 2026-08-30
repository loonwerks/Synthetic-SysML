// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_36a8bf340c7c_4_Valid {
  @pure def check(
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapechannelstateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      escapegateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      escapeoutcomein: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeOutcome.Type,
      threatvalidityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      in_escaperecoverystate: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      escaperecoverystate: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_GumboX.compute_CEP_Post(in_escaperecoverystate, escaperecoverystate, escapeauthorityin, escapeoutcomein, threatvalidityin, escapechannelstateout, escapegateout))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_Candidate_GumboX.compute_CEP_Post(in_escaperecoverystate, escaperecoverystate, escapeauthorityin, escapeoutcomein, threatvalidityin, escapechannelstateout, escapegateout))) & T))
  }
}
