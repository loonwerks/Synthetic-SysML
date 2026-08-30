// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirServiceProposer_supervision_cabinAirServiceProposer {

  def initialise(api: CabinAirServiceProposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_cabinAirProposal(HVAC_Visibility_Priority_Supervisor.CabinAirProposal.example())
  }

  def timeTriggered(api: CabinAirServiceProposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_humidityNeed: Option[HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type] = api.get_humidityNeed()
    api.logInfo(s"Received on data port humidityNeed: ${apiUsage_humidityNeed}")
    val apiUsage_airNeed: Option[HVAC_Visibility_Priority_Supervisor.AirNeed.Type] = api.get_airNeed()
    api.logInfo(s"Received on data port airNeed: ${apiUsage_airNeed}")
    val apiUsage_airPath: Option[HVAC_Visibility_Priority_Supervisor.AirPathReadiness] = api.get_airPath()
    api.logInfo(s"Received on data port airPath: ${apiUsage_airPath}")
  }

  def finalise(api: CabinAirServiceProposer_Operational_Api): Unit = { }
}
