// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter {

  def initialise(api: PreferenceInterpreter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airCareIntent(AirCareIntent.Disabled)
  }

  def timeTriggered(api: PreferenceInterpreter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_01_INVALID_PREFERENCE
        (api.preferenceValidity == PreferenceValidity.Invalid) ___>: (api.airCareIntent == AirCareIntent.Invalid),
        // case CC_02_VALID_PREFERENCE
        (api.preferenceValidity == PreferenceValidity.Valid) ___>: ((api.airCarePreference == AirCarePreference.Off ___>:
          api.airCareIntent == AirCareIntent.Disabled) &
          (api.airCarePreference == AirCarePreference.Auto ___>:
            api.airCareIntent == AirCareIntent.Enabled))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val preference = api.get_airCarePreference()
    val validity = api.get_preferenceValidity()

    (preference, validity) match {
      case (Some(AirCarePreference.Off), Some(PreferenceValidity.Valid)) =>
        api.put_airCareIntent(AirCareIntent.Disabled)
      case (Some(AirCarePreference.Auto), Some(PreferenceValidity.Valid)) =>
        api.put_airCareIntent(AirCareIntent.Enabled)
      case (_, Some(PreferenceValidity.Invalid)) =>
        api.put_airCareIntent(AirCareIntent.Invalid)
      case _ =>
        api.put_airCareIntent(AirCareIntent.Invalid)
    }
  }

  def finalise(api: PreferenceInterpreter_Operational_Api): Unit = { }
}
