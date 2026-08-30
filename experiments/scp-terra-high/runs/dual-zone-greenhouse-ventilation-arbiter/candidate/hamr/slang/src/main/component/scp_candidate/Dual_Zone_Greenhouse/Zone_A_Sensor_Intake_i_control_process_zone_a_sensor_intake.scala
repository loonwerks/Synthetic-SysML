// #Sireum

package scp_candidate.Dual_Zone_Greenhouse

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake {

  def initialise(api: Zone_A_Sensor_Intake_i_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_temperature_out(Dual_Zone_Greenhouse.Temperature_Celsius.example())
    api.put_validity_out(Dual_Zone_Greenhouse.Sensor_Validity.Valid)
  }

  def timeTriggered(api: Zone_A_Sensor_Intake_i_Operational_Api): Unit = {
    Contract(
      Requires(
        Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_GumboX.compute_CEP_Pre(
          api.temperature_in, api.validity_in)
      ),
      Modifies(api),
      Ensures(
        Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_GumboX.compute_CEP_Post(
          api.temperature_in, api.validity_in, api.temperature_out, api.validity_out)
      )
    )

    val temperature = api.get_temperature_in().get
    val validity = api.get_validity_in().get
    api.put_temperature_out(temperature)
    api.put_validity_out(validity)
  }

  def finalise(api: Zone_A_Sensor_Intake_i_Operational_Api): Unit = { }
}
