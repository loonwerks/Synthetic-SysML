// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cc339848a01f_4_Valid {
  @pure def check(
      defenseauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseAuthority.Type,
      defensechannelstateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      defensegateout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      defenseoutcomein: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseOutcome.Type,
      threatvalidityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      in_defenserecoverystate: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      defenserecoverystate: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_GumboX.compute_CEP_Post(in_defenserecoverystate, defenserecoverystate, defenseauthorityin, defenseoutcomein, threatvalidityin, defensechannelstateout, defensegateout))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_Candidate_GumboX.compute_CEP_Post(in_defenserecoverystate, defenserecoverystate, defenseauthorityin, defenseoutcomein, threatvalidityin, defensechannelstateout, defensegateout))) & T))
  }
}
