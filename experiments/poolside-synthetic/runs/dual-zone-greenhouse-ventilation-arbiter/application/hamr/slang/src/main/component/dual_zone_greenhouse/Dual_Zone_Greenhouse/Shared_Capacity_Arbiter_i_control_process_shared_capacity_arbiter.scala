// #Sireum

package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
object Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter {

  def initialise(api: Shared_Capacity_Arbiter_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
    api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
  }

  def timeTriggered(api: Shared_Capacity_Arbiter_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // guarantee PART_06_NEITHER_ELIGIBLE
        //   if neither zone eligible, both fans off
        (api.zone_a_eligibility == Ventilation_Eligibility.Ineligible &
          api.zone_b_eligibility == Ventilation_Eligibility.Ineligible) ___>: (api.zone_a_fan_command == Fan_Command.Off &
          api.zone_b_fan_command == Fan_Command.Off),
        // guarantee PART_06_A_ONLY
        //   if only zone a eligible, fan a on fan b off
        (api.zone_a_eligibility == Ventilation_Eligibility.Eligible &
          api.zone_b_eligibility == Ventilation_Eligibility.Ineligible) ___>: (api.zone_a_fan_command == Fan_Command.On &
          api.zone_b_fan_command == Fan_Command.Off),
        // guarantee PART_06_B_ONLY
        //   if only zone b eligible, fan a off fan b on
        (api.zone_a_eligibility == Ventilation_Eligibility.Ineligible &
          api.zone_b_eligibility == Ventilation_Eligibility.Eligible) ___>: (api.zone_a_fan_command == Fan_Command.Off &
          api.zone_b_fan_command == Fan_Command.On),
        // guarantee PART_06_BOTH_PREFER_A
        //   if both eligible and prefer a, fan a on fan b off
        (api.zone_a_eligibility == Ventilation_Eligibility.Eligible &
          api.zone_b_eligibility == Ventilation_Eligibility.Eligible &
          api.preference == Contention_Preference.Prefer_A) ___>: (api.zone_a_fan_command == Fan_Command.On &
          api.zone_b_fan_command == Fan_Command.Off),
        // guarantee PART_06_BOTH_PREFER_B
        //   if both eligible and prefer b, fan a off fan b on
        (api.zone_a_eligibility == Ventilation_Eligibility.Eligible &
          api.zone_b_eligibility == Ventilation_Eligibility.Eligible &
          api.preference == Contention_Preference.Prefer_B) ___>: (api.zone_a_fan_command == Fan_Command.Off &
          api.zone_b_fan_command == Fan_Command.On)
      )
    )
    val zone_a: Option[Dual_Zone_Greenhouse.Ventilation_Eligibility.Type] = api.get_zone_a_eligibility()
    val zone_b: Option[Dual_Zone_Greenhouse.Ventilation_Eligibility.Type] = api.get_zone_b_eligibility()
    val pref: Option[Dual_Zone_Greenhouse.Contention_Preference.Type] = api.get_preference()

    var cmd_a: Fan_Command.Type = Fan_Command.Off
    var cmd_b: Fan_Command.Type = Fan_Command.Off

    val a_ineligible = zone_a.nonEmpty ___>: zone_a.get == Ventilation_Eligibility.Ineligible
    val b_ineligible = zone_b.nonEmpty ___>: zone_b.get == Ventilation_Eligibility.Ineligible
    val a_eligible = zone_a.nonEmpty ___>: zone_a.get == Ventilation_Eligibility.Eligible
    val b_eligible = zone_b.nonEmpty ___>: zone_b.get == Ventilation_Eligibility.Eligible

    if (a_ineligible & b_ineligible) {
      // PART_06_NEITHER_ELIGIBLE: both fans off
      cmd_a = Fan_Command.Off
      cmd_b = Fan_Command.Off
    } else if (a_eligible & b_ineligible) {
      // PART_06_A_ONLY: fan a on, fan b off
      cmd_a = Fan_Command.On
      cmd_b = Fan_Command.Off
    } else if (a_ineligible & b_eligible) {
      // PART_06_B_ONLY: fan a off, fan b on
      cmd_a = Fan_Command.Off
      cmd_b = Fan_Command.On
    } else if (a_eligible & b_eligible) {
      pref match {
        case Some(Contention_Preference.Prefer_A) =>
          // PART_06_BOTH_PREFER_A: fan a on, fan b off
          cmd_a = Fan_Command.On
          cmd_b = Fan_Command.Off
        case Some(Contention_Preference.Prefer_B) =>
          // PART_06_BOTH_PREFER_B: fan a off, fan b on
          cmd_a = Fan_Command.Off
          cmd_b = Fan_Command.On
        case _ =>
          cmd_a = Fan_Command.Off
          cmd_b = Fan_Command.Off
      }
    }

    api.put_zone_a_fan_command(cmd_a)
    api.put_zone_b_fan_command(cmd_b)
  }

  def finalise(api: Shared_Capacity_Arbiter_i_Operational_Api): Unit = { }
}
