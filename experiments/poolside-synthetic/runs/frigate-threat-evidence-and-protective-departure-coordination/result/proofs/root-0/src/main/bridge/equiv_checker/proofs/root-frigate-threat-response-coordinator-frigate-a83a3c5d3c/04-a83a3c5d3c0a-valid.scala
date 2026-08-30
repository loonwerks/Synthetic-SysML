// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a83a3c5d3c0a_4_Valid {
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
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_GumboX.compute_CEP_Post(alertstatein, defensechannelstatein, defenseproposalin, escapechannelstatein, escapeproposalin, responsepatternin, threatreportin, responseframeout))) ___>: (T)) & T))
  }
}
