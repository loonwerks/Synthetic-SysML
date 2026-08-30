// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3ddacd4c7639_4_Valid {
  @pure def check(
      escapeauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeAuthority.Type,
      escapechannelstateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      escapegateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      escapeoutcomein: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeOutcome.Type,
      threatvalidityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      escaperecoverystate: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_GumboX.inititialize_IEP_Post(escaperecoverystate, escapechannelstateout, escapegateout))) ___>: (T)) & T))
  }
}
