// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier {

  def initialise(api: PreferenceRequestQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_candidate(Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate.example())
  }

  def timeTriggered(api: PreferenceRequestQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_preference: Option[Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference] = api.get_preference()
    api.logInfo(s"Received on data port preference: ${apiUsage_preference}")
  }

  def finalise(api: PreferenceRequestQualifier_Operational_Api): Unit = { }
}
