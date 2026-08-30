// #Sireum

package scp_candidate.Cabin_Air_Care_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter {

  def initialise(api: PreferenceInterpreter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_airCareIntent(AirCareIntent.Invalid)
  }

  def timeTriggered(api: PreferenceInterpreter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_GumboX.compute_CEP_Post(
          api.airCarePreference, api.preferenceValidity, api.airCareIntent)
      )
    )

    val preference = api.get_airCarePreference().get
    val validity = api.get_preferenceValidity().get
    if (validity == PreferenceValidity.Invalid) {
      api.put_airCareIntent(AirCareIntent.Invalid)
    } else if (preference == AirCarePreference.Off) {
      api.put_airCareIntent(AirCareIntent.Disabled)
    } else {
      api.put_airCareIntent(AirCareIntent.Enabled)
    }
  }

  def finalise(api: PreferenceInterpreter_Operational_Api): Unit = { }
}
