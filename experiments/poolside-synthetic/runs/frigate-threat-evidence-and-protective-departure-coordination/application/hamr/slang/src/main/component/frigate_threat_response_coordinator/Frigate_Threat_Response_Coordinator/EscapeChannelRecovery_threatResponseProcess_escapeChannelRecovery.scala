// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery {

  def initialise(api: EscapeChannelRecovery_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeGateOut(Frigate_Threat_Response_Coordinator.ChannelGate.OPEN)
    api.put_escapeChannelStateOut(Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE)
  }

  def timeTriggered(api: EscapeChannelRecovery_Operational_Api): Unit = {
    // example api usage

    val apiUsage_escapeAuthorityIn: Option[Frigate_Threat_Response_Coordinator.EscapeAuthority.Type] = api.get_escapeAuthorityIn()
    api.logInfo(s"Received on data port escapeAuthorityIn: ${apiUsage_escapeAuthorityIn}")
    val apiUsage_escapeOutcomeIn: Option[Frigate_Threat_Response_Coordinator.EscapeOutcome.Type] = api.get_escapeOutcomeIn()
    api.logInfo(s"Received on data port escapeOutcomeIn: ${apiUsage_escapeOutcomeIn}")
    val apiUsage_threatValidityIn: Option[Frigate_Threat_Response_Coordinator.ThreatValidity.Type] = api.get_threatValidityIn()
    api.logInfo(s"Received on data port threatValidityIn: ${apiUsage_threatValidityIn}")
  }

  def finalise(api: EscapeChannelRecovery_Operational_Api): Unit = { }
}
