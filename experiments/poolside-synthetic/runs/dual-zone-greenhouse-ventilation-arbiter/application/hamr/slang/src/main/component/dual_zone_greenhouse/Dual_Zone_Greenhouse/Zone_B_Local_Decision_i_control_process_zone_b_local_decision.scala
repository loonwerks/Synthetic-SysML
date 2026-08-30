// #Sireum

package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
object Zone_B_Local_Decision_i_control_process_zone_b_local_decision {

  def initialise(api: Zone_B_Local_Decision_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_eligibility(Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible)
    api.put_sensor_fault(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
  }

  def timeTriggered(api: Zone_B_Local_Decision_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // guarantee PART_05_VALID_ABOVE
        //   if valid and temperature exceeds upper limit, eligible and clear
        (api.validity == Sensor_Validity.Valid &
          api.temperature.degrees_celsius > api.upper_limit.degrees_celsius) ___>: (api.eligibility == Ventilation_Eligibility.Eligible &
          api.sensor_fault == Sensor_Fault_Indication.Clear),
        // guarantee PART_05_VALID_AT_OR_BELOW
        //   if valid and temperature at or below upper limit, ineligible and clear
        (api.validity == Sensor_Validity.Valid &
          api.temperature.degrees_celsius <= api.upper_limit.degrees_celsius) ___>: (api.eligibility == Ventilation_Eligibility.Ineligible &
          api.sensor_fault == Sensor_Fault_Indication.Clear),
        // guarantee PART_05_INVALID
        //   if invalid, ineligible and asserted
        (api.validity == Sensor_Validity.Invalid) ___>: (api.eligibility == Ventilation_Eligibility.Ineligible &
          api.sensor_fault == Sensor_Fault_Indication.Asserted)
      )
    )
    val validity = api.get_validity()
    val temp = api.get_temperature()
    val limit = api.get_upper_limit()

    var elig: Ventilation_Eligibility.Type = Ventilation_Eligibility.Ineligible
    var fault: Sensor_Fault_Indication.Type = Sensor_Fault_Indication.Clear

    validity match {
      case Some(Sensor_Validity.Invalid) =>
        elig = Ventilation_Eligibility.Ineligible
        fault = Sensor_Fault_Indication.Asserted
      case Some(Sensor_Validity.Valid) =>
        if (temp.nonEmpty & limit.nonEmpty) {
          if (temp.get.degrees_celsius > limit.get.degrees_celsius) {
            elig = Ventilation_Eligibility.Eligible
            fault = Sensor_Fault_Indication.Clear
          } else {
            elig = Ventilation_Eligibility.Ineligible
            fault = Sensor_Fault_Indication.Clear
          }
        } else {
          elig = Ventilation_Eligibility.Ineligible
          fault = Sensor_Fault_Indication.Clear
        }
      case _ =>
        elig = Ventilation_Eligibility.Ineligible
        fault = Sensor_Fault_Indication.Clear
    }

    api.put_eligibility(elig)
    api.put_sensor_fault(fault)
  }

  def finalise(api: Zone_B_Local_Decision_i_Operational_Api): Unit = { }
}
