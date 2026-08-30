// #Sireum

package scp_candidate.Dual_Zone_Greenhouse

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Zone_B_Local_Decision_i_control_process_zone_b_local_decision {

  def initialise(api: Zone_B_Local_Decision_i_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibility(Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible)
    api.put_sensor_fault(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
  }

  def timeTriggered(api: Zone_B_Local_Decision_i_Operational_Api): Unit = {
    Contract(
      Requires(
        Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Pre(
          api.temperature, api.upper_limit, api.validity)
      ),
      Modifies(api),
      Ensures(
        Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Post(
          api.temperature, api.upper_limit, api.validity, api.eligibility, api.sensor_fault)
      )
    )

    val temperature = api.get_temperature().get
    val validity = api.get_validity().get
    val upperLimit = api.get_upper_limit().get
    if (validity == Dual_Zone_Greenhouse.Sensor_Validity.Valid) {
      if (temperature.degrees_celsius > upperLimit.degrees_celsius) {
        api.put_eligibility(Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible)
        api.put_sensor_fault(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
      } else {
        api.put_eligibility(Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible)
        api.put_sensor_fault(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
      }
    } else {
      api.put_eligibility(Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible)
      api.put_sensor_fault(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Asserted)
    }
  }

  def finalise(api: Zone_B_Local_Decision_i_Operational_Api): Unit = { }
}
