// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d15252ea832d_3_Valid {
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
      Ensures((T) ___>: (T)))
  }
}
