// #Sireum

package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
object Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake {

  def initialise(api: Zone_B_Sensor_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_temperature_out(Dual_Zone_Greenhouse.Temperature_Celsius.example())
    api.put_validity_out(Dual_Zone_Greenhouse.Sensor_Validity.Valid)
  }

  def timeTriggered(api: Zone_B_Sensor_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // guarantee PART_02_PRESERVE_TEMPERATURE
        //   temperature out equals temperature in
        api.temperature_out == api.temperature_in,
        // guarantee PART_02_PRESERVE_VALIDITY
        //   validity out equals validity in
        api.validity_out == api.validity_in
      )
    )
    val temp_in = api.get_temperature_in()
    val validity_in = api.get_validity_in()

    if (temp_in.nonEmpty) {
      api.put_temperature_out(temp_in.get)
    }
    if (validity_in.nonEmpty) {
      api.put_validity_out(validity_in.get)
    }
  }

  def finalise(api: Zone_B_Sensor_Intake_i_Operational_Api): Unit = { }
}
