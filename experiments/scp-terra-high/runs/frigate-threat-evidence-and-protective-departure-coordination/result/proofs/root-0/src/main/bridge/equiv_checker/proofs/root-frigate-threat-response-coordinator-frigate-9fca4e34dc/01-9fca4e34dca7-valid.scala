// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9fca4e34dca7_1_Valid {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defensechannelstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      defenseproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      escapechannelstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelState.Type,
      escapeproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      responseframeout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseFrame,
      responsepatternin: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponsePattern.Type,
      threatreportin: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
