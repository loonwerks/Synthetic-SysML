// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d15252ea832d_2_Valid {
  @pure def check(
      zone_a_fan_command_in: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type,
      zone_a_fan_command_out: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type,
      zone_a_sensor_fault_in: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type,
      zone_a_sensor_fault_out: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type,
      zone_b_fan_command_in: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type,
      zone_b_fan_command_out: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type,
      zone_b_sensor_fault_in: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type,
      zone_b_sensor_fault_out: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_Candidate_GumboX.compute_CEP_Post(zone_a_fan_command_in, zone_a_sensor_fault_in, zone_b_fan_command_in, zone_b_sensor_fault_in, zone_a_fan_command_out, zone_a_sensor_fault_out, zone_b_fan_command_out, zone_b_sensor_fault_out))) ___>: (equiv_shared_0.Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_GumboX.compute_CEP_Post(zone_a_fan_command_in, zone_a_sensor_fault_in, zone_b_fan_command_in, zone_b_sensor_fault_in, zone_a_fan_command_out, zone_a_sensor_fault_out, zone_b_fan_command_out, zone_b_sensor_fault_out))) & T))
  }
}
