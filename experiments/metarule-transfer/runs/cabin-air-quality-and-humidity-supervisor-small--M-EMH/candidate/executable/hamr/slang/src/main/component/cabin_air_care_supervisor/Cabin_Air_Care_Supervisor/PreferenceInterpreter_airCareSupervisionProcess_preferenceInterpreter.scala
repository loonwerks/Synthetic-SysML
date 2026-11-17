// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter {

  def initialise(api: PreferenceInterpreter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Disabled)
  }

  def timeTriggered(api: PreferenceInterpreter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_01_INVALID_PREFERENCE
        (api.preferenceValidity == PreferenceValidity.Invalid) ___>: (api.airCareIntent == AirCareIntent.Invalid),
        // case CC_02_VALID_OFF
        (api.preferenceValidity == PreferenceValidity.Valid &
          api.airCarePreference == AirCarePreference.Off) ___>: (api.airCareIntent == AirCareIntent.Disabled),
        // case CC_02_VALID_AUTO
        (api.preferenceValidity == PreferenceValidity.Valid &
          api.airCarePreference == AirCarePreference.Auto) ___>: (api.airCareIntent == AirCareIntent.Enabled)
        // END COMPUTE ENSURES timeTriggered
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
