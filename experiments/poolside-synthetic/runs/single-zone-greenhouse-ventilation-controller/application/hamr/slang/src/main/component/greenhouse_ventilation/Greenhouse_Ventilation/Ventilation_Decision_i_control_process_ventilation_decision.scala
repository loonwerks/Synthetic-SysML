// #Sireum

package greenhouse_ventilation.Greenhouse_Ventilation

import org.sireum._
import greenhouse_ventilation._

// This file will not be overwritten if HAMR codegen is rerun
object Ventilation_Decision_i_control_process_ventilation_decision {

  def initialise(api: Ventilation_Decision_i_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_fan_command(Greenhouse_Ventilation.Fan_Command.On)
    api.put_sensor_fault(Greenhouse_Ventilation.Sensor_Fault_Indication.Clear)
  }

  def timeTriggered(api: Ventilation_Decision_i_Operational_Api): Unit = {
    // example api usage

    val apiUsage_temperature: Option[Greenhouse_Ventilation.Temperature_Celsius] = api.get_temperature()
    api.logInfo(s"Received on data port temperature: ${apiUsage_temperature}")
    val apiUsage_validity: Option[Greenhouse_Ventilation.Temperature_Validity.Type] = api.get_validity()
    api.logInfo(s"Received on data port validity: ${apiUsage_validity}")
    val apiUsage_upper_limit: Option[Greenhouse_Ventilation.Upper_Temperature_Limit] = api.get_upper_limit()
    api.logInfo(s"Received on data port upper_limit: ${apiUsage_upper_limit}")
  }

  def finalise(api: Ventilation_Decision_i_Operational_Api): Unit = { }
}
