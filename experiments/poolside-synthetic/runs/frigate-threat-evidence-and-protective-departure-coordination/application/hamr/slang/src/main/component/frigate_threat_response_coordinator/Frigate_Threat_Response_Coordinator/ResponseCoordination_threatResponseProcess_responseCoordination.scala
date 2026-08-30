// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseCoordination_threatResponseProcess_responseCoordination {

  def initialise(api: ResponseCoordination_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responsePatternOut(Frigate_Threat_Response_Coordinator.ResponsePattern.OBSERVE)
  }

  def timeTriggered(api: ResponseCoordination_Operational_Api): Unit = {
    // example api usage

    val apiUsage_defenseProposalIn: Option[Frigate_Threat_Response_Coordinator.DefenseProposal.Type] = api.get_defenseProposalIn()
    api.logInfo(s"Received on data port defenseProposalIn: ${apiUsage_defenseProposalIn}")
    val apiUsage_escapeProposalIn: Option[Frigate_Threat_Response_Coordinator.EscapeProposal.Type] = api.get_escapeProposalIn()
    api.logInfo(s"Received on data port escapeProposalIn: ${apiUsage_escapeProposalIn}")
  }

  def finalise(api: ResponseCoordination_Operational_Api): Unit = { }
}
