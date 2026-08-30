// #Sireum

package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
object Operator_Configuration_Intake_i_control_process_operator_configuration_intake {

  def initialise(api: Operator_Configuration_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_upper_limit_for_a(Dual_Zone_Greenhouse.Upper_Temperature_Limit.example())
    api.put_upper_limit_for_b(Dual_Zone_Greenhouse.Upper_Temperature_Limit.example())
    api.put_preference_out(Dual_Zone_Greenhouse.Contention_Preference.Prefer_A)
  }

  def timeTriggered(api: Operator_Configuration_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // guarantee PART_03_PRESERVE_LIMIT_FOR_A
        //   upper limit for a equals upper limit in
        api.upper_limit_for_a == api.upper_limit_in,
        // guarantee PART_03_PRESERVE_LIMIT_FOR_B
        //   upper limit for b equals upper limit in
        api.upper_limit_for_b == api.upper_limit_in,
        // guarantee PART_03_PRESERVE_PREFERENCE
        //   preference out equals preference in
        api.preference_out == api.preference_in
      )
    )
    api.put_upper_limit_for_a(api.get_upper_limit_in().get)
    api.put_upper_limit_for_b(api.get_upper_limit_in().get)
    api.put_preference_out(api.get_preference_in().get)
  }

  def finalise(api: Operator_Configuration_Intake_i_Operational_Api): Unit = { }
}
