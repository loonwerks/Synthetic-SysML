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
        //   Invalid preference yields Invalid intent
        (api.preferenceValidity == PreferenceValidity.Invalid) ___>: (api.airCareIntent == AirCareIntent.Invalid),
        // case CC_02_VALID_PREFERENCE
        //   Off yields Disabled, Auto yields Enabled
        (api.preferenceValidity == PreferenceValidity.Valid) ___>: ((api.airCarePreference == AirCarePreference.Off ___>:
          api.airCareIntent == AirCareIntent.Disabled) &
          (api.airCarePreference == AirCarePreference.Auto ___>:
            api.airCareIntent == AirCareIntent.Enabled))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val preferenceValidity: Cabin_Air_Care_Supervisor.PreferenceValidity.Type = api.get_preferenceValidity().get
    val airCarePreference: Cabin_Air_Care_Supervisor.AirCarePreference.Type = api.get_airCarePreference().get

    preferenceValidity match {
      case Cabin_Air_Care_Supervisor.PreferenceValidity.Invalid =>
        api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Invalid)
      case Cabin_Air_Care_Supervisor.PreferenceValidity.Valid =>
        airCarePreference match {
          case Cabin_Air_Care_Supervisor.AirCarePreference.Off =>
            api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Disabled)
          case Cabin_Air_Care_Supervisor.AirCarePreference.Auto =>
            api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Enabled)
        }
    }
  }

  def finalise(api: PreferenceInterpreter_Operational_Api): Unit = { }
}
