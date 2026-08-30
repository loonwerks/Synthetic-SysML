// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_supervision_airQualityNeedAssessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airNeed(HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_airObservation: Option[HVAC_Visibility_Priority_Supervisor.AirQualityObservation] = api.get_airObservation()
    api.logInfo(s"Received on data port airObservation: ${apiUsage_airObservation}")
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
