// #Sireum

package scp_candidate.Dual_Zone_Greenhouse

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter {

  def initialise(api: Shared_Capacity_Arbiter_i_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
    api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
  }

  def timeTriggered(api: Shared_Capacity_Arbiter_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_GumboX.compute_CEP_Post(
          api.preference, api.zone_a_eligibility, api.zone_b_eligibility,
          api.zone_a_fan_command, api.zone_b_fan_command)
      )
    )

    val zoneAEligibility = api.get_zone_a_eligibility().get
    val zoneBEligibility = api.get_zone_b_eligibility().get
    val preference = api.get_preference().get

    if (zoneAEligibility == Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible) {
      if (zoneBEligibility == Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible) {
        if (preference == Dual_Zone_Greenhouse.Contention_Preference.Prefer_A) {
          api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
          api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
        } else {
          api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
          api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
        }
      } else {
        api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
        api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
      }
    } else if (zoneBEligibility == Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible) {
      api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
      api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.On)
    } else {
      api.put_zone_a_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
      api.put_zone_b_fan_command(Dual_Zone_Greenhouse.Fan_Command.Off)
    }
  }

  def finalise(api: Shared_Capacity_Arbiter_i_Operational_Api): Unit = { }
}
