// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter {

  def initialise(api: PreferenceInterpreter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Disabled)
  }

  def timeTriggered(api: PreferenceInterpreter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_airCarePreference: Option[Cabin_Air_Care_Supervisor.AirCarePreference.Type] = api.get_airCarePreference()
    api.logInfo(s"Received on data port airCarePreference: ${apiUsage_airCarePreference}")
    val apiUsage_preferenceValidity: Option[Cabin_Air_Care_Supervisor.PreferenceValidity.Type] = api.get_preferenceValidity()
    api.logInfo(s"Received on data port preferenceValidity: ${apiUsage_preferenceValidity}")
  }

  def finalise(api: PreferenceInterpreter_Operational_Api): Unit = { }
}
