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
        //   Invalid preference produces Invalid intent | <N.md#CC_01_INVALID_PREFERENCE>
        (api.preferenceValidity == Cabin_Air_Care_Supervisor.PreferenceValidity.Invalid) ___>: (api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Invalid),
        // case CC_02_VALID_PREFERENCE
        //   A valid Off disables and a valid Auto enables air care | <N.md#CC_02_VALID_PREFERENCE>
        (api.preferenceValidity == Cabin_Air_Care_Supervisor.PreferenceValidity.Valid) ___>: ((api.airCarePreference == Cabin_Air_Care_Supervisor.AirCarePreference.Off ___>:
          api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Disabled) &
          (api.airCarePreference == Cabin_Air_Care_Supervisor.AirCarePreference.Auto ___>:
            api.airCareIntent == Cabin_Air_Care_Supervisor.AirCareIntent.Enabled))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val preference = api.get_airCarePreference().get
    val validity = api.get_preferenceValidity().get

    if (validity == Cabin_Air_Care_Supervisor.PreferenceValidity.Invalid) {
      api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Invalid)
    } else if (preference == Cabin_Air_Care_Supervisor.AirCarePreference.Off) {
      api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Disabled)
    } else {
      api.put_airCareIntent(Cabin_Air_Care_Supervisor.AirCareIntent.Enabled)
    }
  }

  def finalise(api: PreferenceInterpreter_Operational_Api): Unit = { }
}
