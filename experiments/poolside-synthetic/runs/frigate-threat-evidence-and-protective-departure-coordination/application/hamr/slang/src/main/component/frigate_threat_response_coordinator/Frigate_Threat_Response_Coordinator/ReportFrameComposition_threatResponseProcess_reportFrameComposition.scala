// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReportFrameComposition_threatResponseProcess_reportFrameComposition {

  def initialise(api: ReportFrameComposition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responseFrameOut(Frigate_Threat_Response_Coordinator.ResponseFrame.example())
  }

  def timeTriggered(api: ReportFrameComposition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_responsePatternIn: Option[Frigate_Threat_Response_Coordinator.ResponsePattern.Type] = api.get_responsePatternIn()
    api.logInfo(s"Received on data port responsePatternIn: ${apiUsage_responsePatternIn}")
    val apiUsage_defenseProposalIn: Option[Frigate_Threat_Response_Coordinator.DefenseProposal.Type] = api.get_defenseProposalIn()
    api.logInfo(s"Received on data port defenseProposalIn: ${apiUsage_defenseProposalIn}")
    val apiUsage_escapeProposalIn: Option[Frigate_Threat_Response_Coordinator.EscapeProposal.Type] = api.get_escapeProposalIn()
    api.logInfo(s"Received on data port escapeProposalIn: ${apiUsage_escapeProposalIn}")
    val apiUsage_alertStateIn: Option[Frigate_Threat_Response_Coordinator.AlertState.Type] = api.get_alertStateIn()
    api.logInfo(s"Received on data port alertStateIn: ${apiUsage_alertStateIn}")
    val apiUsage_threatReportIn: Option[Frigate_Threat_Response_Coordinator.ThreatReport.Type] = api.get_threatReportIn()
    api.logInfo(s"Received on data port threatReportIn: ${apiUsage_threatReportIn}")
    val apiUsage_defenseChannelStateIn: Option[Frigate_Threat_Response_Coordinator.ChannelState.Type] = api.get_defenseChannelStateIn()
    api.logInfo(s"Received on data port defenseChannelStateIn: ${apiUsage_defenseChannelStateIn}")
    val apiUsage_escapeChannelStateIn: Option[Frigate_Threat_Response_Coordinator.ChannelState.Type] = api.get_escapeChannelStateIn()
    api.logInfo(s"Received on data port escapeChannelStateIn: ${apiUsage_escapeChannelStateIn}")
  }

  def finalise(api: ReportFrameComposition_Operational_Api): Unit = { }
}
