// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DepartureReadiness_threatResponseProcess_departureReadiness {

  def initialise(api: DepartureReadiness_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeReadyOut(Base_Types.Boolean_example())
  }

  def timeTriggered(api: DepartureReadiness_Operational_Api): Unit = {
    // example api usage

    val apiUsage_navigationAvailableIn: Option[Base_Types.Boolean] = api.get_navigationAvailableIn()
    api.logInfo(s"Received on data port navigationAvailableIn: ${apiUsage_navigationAvailableIn}")
    val apiUsage_routeStatusIn: Option[Frigate_Threat_Response_Coordinator.RouteStatus.Type] = api.get_routeStatusIn()
    api.logInfo(s"Received on data port routeStatusIn: ${apiUsage_routeStatusIn}")
    val apiUsage_miningInterlockIn: Option[Frigate_Threat_Response_Coordinator.MiningInterlock.Type] = api.get_miningInterlockIn()
    api.logInfo(s"Received on data port miningInterlockIn: ${apiUsage_miningInterlockIn}")
    val apiUsage_escapeGateIn: Option[Frigate_Threat_Response_Coordinator.ChannelGate.Type] = api.get_escapeGateIn()
    api.logInfo(s"Received on data port escapeGateIn: ${apiUsage_escapeGateIn}")
  }

  def finalise(api: DepartureReadiness_Operational_Api): Unit = { }
}
