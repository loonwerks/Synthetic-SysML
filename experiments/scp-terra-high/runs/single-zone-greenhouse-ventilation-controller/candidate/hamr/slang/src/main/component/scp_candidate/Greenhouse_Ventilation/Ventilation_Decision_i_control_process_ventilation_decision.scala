// #Sireum

package scp_candidate.Greenhouse_Ventilation

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Ventilation_Decision_i_control_process_ventilation_decision {

  def initialise(api: Ventilation_Decision_i_Initialization_Api): Unit = { }

  def timeTriggered(api: Ventilation_Decision_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        (api.validity == Greenhouse_Ventilation.Temperature_Validity.Valid &&
          api.temperature.degrees_celsius > api.upper_limit.degrees_celsius) ___>:
          (api.fan_command == Greenhouse_Ventilation.Fan_Command.On &&
            api.sensor_fault == Greenhouse_Ventilation.Sensor_Fault_Indication.Clear),
        (api.validity == Greenhouse_Ventilation.Temperature_Validity.Valid &&
          api.temperature.degrees_celsius <= api.upper_limit.degrees_celsius) ___>:
          (api.fan_command == Greenhouse_Ventilation.Fan_Command.Off &&
            api.sensor_fault == Greenhouse_Ventilation.Sensor_Fault_Indication.Clear),
        (api.validity == Greenhouse_Ventilation.Temperature_Validity.Invalid) ___>:
          (api.fan_command == Greenhouse_Ventilation.Fan_Command.Off &&
            api.sensor_fault == Greenhouse_Ventilation.Sensor_Fault_Indication.Asserted)
      )
    )

    val temperature = api.get_temperature().get
    val validity = api.get_validity().get
    val upperLimit = api.get_upper_limit().get

    if (validity == Greenhouse_Ventilation.Temperature_Validity.Valid) {
      if (temperature.degrees_celsius > upperLimit.degrees_celsius) {
        api.put_fan_command(Greenhouse_Ventilation.Fan_Command.On)
        api.put_sensor_fault(Greenhouse_Ventilation.Sensor_Fault_Indication.Clear)
      } else {
        api.put_fan_command(Greenhouse_Ventilation.Fan_Command.Off)
        api.put_sensor_fault(Greenhouse_Ventilation.Sensor_Fault_Indication.Clear)
      }
    } else {
      api.put_fan_command(Greenhouse_Ventilation.Fan_Command.Off)
      api.put_sensor_fault(Greenhouse_Ventilation.Sensor_Fault_Indication.Asserted)
    }
  }

  def finalise(api: Ventilation_Decision_i_Operational_Api): Unit = { }
}
