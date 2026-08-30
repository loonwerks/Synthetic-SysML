// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery {

  def initialise(api: DefenseChannelRecovery_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseGateOut(Frigate_Threat_Response_Coordinator.ChannelGate.OPEN)
    api.put_defenseChannelStateOut(Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE)
  }

  def timeTriggered(api: DefenseChannelRecovery_Operational_Api): Unit = {
    // example api usage

    val apiUsage_defenseAuthorityIn: Option[Frigate_Threat_Response_Coordinator.DefenseAuthority.Type] = api.get_defenseAuthorityIn()
    api.logInfo(s"Received on data port defenseAuthorityIn: ${apiUsage_defenseAuthorityIn}")
    val apiUsage_defenseOutcomeIn: Option[Frigate_Threat_Response_Coordinator.DefenseOutcome.Type] = api.get_defenseOutcomeIn()
    api.logInfo(s"Received on data port defenseOutcomeIn: ${apiUsage_defenseOutcomeIn}")
    val apiUsage_threatValidityIn: Option[Frigate_Threat_Response_Coordinator.ThreatValidity.Type] = api.get_threatValidityIn()
    api.logInfo(s"Received on data port threatValidityIn: ${apiUsage_threatValidityIn}")
  }

  def finalise(api: DefenseChannelRecovery_Operational_Api): Unit = { }
}
