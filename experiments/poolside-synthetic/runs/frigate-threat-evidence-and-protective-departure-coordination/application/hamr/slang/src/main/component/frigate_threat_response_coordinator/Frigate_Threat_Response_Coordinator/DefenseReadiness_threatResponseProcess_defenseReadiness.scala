// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadiness_threatResponseProcess_defenseReadiness {

  def initialise(api: DefenseReadiness_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseReadyOut(Base_Types.Boolean_example())
  }

  def timeTriggered(api: DefenseReadiness_Operational_Api): Unit = {
    // example api usage

    val apiUsage_readinessContextIn: Option[Frigate_Threat_Response_Coordinator.DefenseReadinessContext] = api.get_readinessContextIn()
    api.logInfo(s"Received on data port readinessContextIn: ${apiUsage_readinessContextIn}")
    val apiUsage_defenseGateIn: Option[Frigate_Threat_Response_Coordinator.ChannelGate.Type] = api.get_defenseGateIn()
    api.logInfo(s"Received on data port defenseGateIn: ${apiUsage_defenseGateIn}")
  }

  def finalise(api: DefenseReadiness_Operational_Api): Unit = { }
}
