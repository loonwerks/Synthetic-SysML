// #Sireum

package scp_candidate.Dual_Zone_Greenhouse

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Boundary_Output_Delivery_i_control_process_boundary_output_delivery {

  def initialise(api: Boundary_Output_Delivery_i_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_zone_a_fan_command_out(Dual_Zone_Greenhouse.Fan_Command.On)
    api.put_zone_b_fan_command_out(Dual_Zone_Greenhouse.Fan_Command.On)
    api.put_zone_a_sensor_fault_out(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
    api.put_zone_b_sensor_fault_out(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
  }

  def timeTriggered(api: Boundary_Output_Delivery_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Boundary_Output_Delivery_i_control_process_boundary_output_delivery_GumboX.compute_CEP_Post(
          api.zone_a_fan_command_in, api.zone_a_sensor_fault_in,
          api.zone_b_fan_command_in, api.zone_b_sensor_fault_in,
          api.zone_a_fan_command_out, api.zone_a_sensor_fault_out,
          api.zone_b_fan_command_out, api.zone_b_sensor_fault_out)
      )
    )

    val zoneAFanCommand = api.get_zone_a_fan_command_in().get
    val zoneBFanCommand = api.get_zone_b_fan_command_in().get
    val zoneASensorFault = api.get_zone_a_sensor_fault_in().get
    val zoneBSensorFault = api.get_zone_b_sensor_fault_in().get
    api.put_zone_a_fan_command_out(zoneAFanCommand)
    api.put_zone_b_fan_command_out(zoneBFanCommand)
    api.put_zone_a_sensor_fault_out(zoneASensorFault)
    api.put_zone_b_sensor_fault_out(zoneBSensorFault)
  }

  def finalise(api: Boundary_Output_Delivery_i_Operational_Api): Unit = { }
}
