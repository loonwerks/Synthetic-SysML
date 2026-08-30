// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityNeedAssessor_supervision_humidityNeedAssessor {

  def initialise(api: HumidityNeedAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityNeed(HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable)
  }

  def timeTriggered(api: HumidityNeedAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_humidityObservation: Option[HVAC_Visibility_Priority_Supervisor.HumidityObservation] = api.get_humidityObservation()
    api.logInfo(s"Received on data port humidityObservation: ${apiUsage_humidityObservation}")
  }

  def finalise(api: HumidityNeedAssessor_Operational_Api): Unit = { }
}
