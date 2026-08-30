// #Sireum

package dual_zone_greenhouse.Dual_Zone_Greenhouse

import org.sireum._
import dual_zone_greenhouse._

// This file will not be overwritten if HAMR codegen is rerun
object Boundary_Output_Delivery_i_control_process_boundary_output_delivery {

  def initialise(api: Boundary_Output_Delivery_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_zone_a_fan_command_out(Dual_Zone_Greenhouse.Fan_Command.Off)
    api.put_zone_b_fan_command_out(Dual_Zone_Greenhouse.Fan_Command.Off)
    api.put_zone_a_sensor_fault_out(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
    api.put_zone_b_sensor_fault_out(Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)
  }

  def timeTriggered(api: Boundary_Output_Delivery_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // guarantee PART_07_PRESERVE_A_FAN_COMMAND
        //   zone a fan command out equals zone a fan command in
        api.zone_a_fan_command_out == api.zone_a_fan_command_in,
        // guarantee PART_07_PRESERVE_B_FAN_COMMAND
        //   zone b fan command out equals zone b fan command in
        api.zone_b_fan_command_out == api.zone_b_fan_command_in,
        // guarantee PART_07_PRESERVE_A_SENSOR_FAULT
        //   zone a sensor fault out equals zone a sensor fault in
        api.zone_a_sensor_fault_out == api.zone_a_sensor_fault_in,
        // guarantee PART_07_PRESERVE_B_SENSOR_FAULT
        //   zone b sensor fault out equals zone b sensor fault in
        api.zone_b_sensor_fault_out == api.zone_b_sensor_fault_in
      )
    )
    api.put_zone_a_fan_command_out(api.get_zone_a_fan_command_in().get)
    api.put_zone_b_fan_command_out(api.get_zone_b_fan_command_in().get)
    api.put_zone_a_sensor_fault_out(api.get_zone_a_sensor_fault_in().get)
    api.put_zone_b_sensor_fault_out(api.get_zone_b_sensor_fault_in().get)
  }

  def finalise(api: Boundary_Output_Delivery_i_Operational_Api): Unit = { }
}
