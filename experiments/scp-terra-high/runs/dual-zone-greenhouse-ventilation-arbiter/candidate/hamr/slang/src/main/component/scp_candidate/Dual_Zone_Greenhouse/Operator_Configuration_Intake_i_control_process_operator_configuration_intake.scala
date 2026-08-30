// #Sireum

package scp_candidate.Dual_Zone_Greenhouse

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Operator_Configuration_Intake_i_control_process_operator_configuration_intake {

  def initialise(api: Operator_Configuration_Intake_i_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_upper_limit_for_a(Dual_Zone_Greenhouse.Upper_Temperature_Limit.example())
    api.put_upper_limit_for_b(Dual_Zone_Greenhouse.Upper_Temperature_Limit.example())
    api.put_preference_out(Dual_Zone_Greenhouse.Contention_Preference.Prefer_A)
  }

  def timeTriggered(api: Operator_Configuration_Intake_i_Operational_Api): Unit = {
    Contract(
      Requires(
        Operator_Configuration_Intake_i_control_process_operator_configuration_intake_GumboX.compute_CEP_Pre(
          api.preference_in, api.upper_limit_in)
      ),
      Modifies(api),
      Ensures(
        Operator_Configuration_Intake_i_control_process_operator_configuration_intake_GumboX.compute_CEP_Post(
          api.preference_in, api.upper_limit_in, api.preference_out,
          api.upper_limit_for_a, api.upper_limit_for_b)
      )
    )

    val upperLimit = api.get_upper_limit_in().get
    val preference = api.get_preference_in().get
    api.put_upper_limit_for_a(upperLimit)
    api.put_upper_limit_for_b(upperLimit)
    api.put_preference_out(preference)
  }

  def finalise(api: Operator_Configuration_Intake_i_Operational_Api): Unit = { }
}
