// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision {

  def initialise(api: DepartureInitiationDecision_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeProposalToCoordinationOut(Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)
    api.put_escapeProposalToCompositionOut(Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)
  }

  def timeTriggered(api: DepartureInitiationDecision_Operational_Api): Unit = {
    // example api usage

    val apiUsage_alertStateIn: Option[Frigate_Threat_Response_Coordinator.AlertState.Type] = api.get_alertStateIn()
    api.logInfo(s"Received on data port alertStateIn: ${apiUsage_alertStateIn}")
    val apiUsage_escapeReadyIn: Option[Base_Types.Boolean] = api.get_escapeReadyIn()
    api.logInfo(s"Received on data port escapeReadyIn: ${apiUsage_escapeReadyIn}")
    val apiUsage_escapeAuthorityIn: Option[Frigate_Threat_Response_Coordinator.EscapeAuthority.Type] = api.get_escapeAuthorityIn()
    api.logInfo(s"Received on data port escapeAuthorityIn: ${apiUsage_escapeAuthorityIn}")
  }

  def finalise(api: DepartureInitiationDecision_Operational_Api): Unit = { }
}
