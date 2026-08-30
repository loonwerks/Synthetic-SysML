// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseActivationDecision_threatResponseProcess_defenseActivationDecision {

  def initialise(api: DefenseActivationDecision_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseProposalToCoordinationOut(Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)
    api.put_defenseProposalToCompositionOut(Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)
  }

  def timeTriggered(api: DefenseActivationDecision_Operational_Api): Unit = {
    // example api usage

    val apiUsage_alertStateIn: Option[Frigate_Threat_Response_Coordinator.AlertState.Type] = api.get_alertStateIn()
    api.logInfo(s"Received on data port alertStateIn: ${apiUsage_alertStateIn}")
    val apiUsage_defenseReadyIn: Option[Base_Types.Boolean] = api.get_defenseReadyIn()
    api.logInfo(s"Received on data port defenseReadyIn: ${apiUsage_defenseReadyIn}")
    val apiUsage_defenseAuthorityIn: Option[Frigate_Threat_Response_Coordinator.DefenseAuthority.Type] = api.get_defenseAuthorityIn()
    api.logInfo(s"Received on data port defenseAuthorityIn: ${apiUsage_defenseAuthorityIn}")
  }

  def finalise(api: DefenseActivationDecision_Operational_Api): Unit = { }
}
