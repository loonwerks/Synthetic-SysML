// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_913d9f17f66a_Oracle_Assumption_Satisfiable {
  @pure def check(
      temperature_in: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      validity_in: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_GumboX.compute_CEP_Pre(temperature_in, validity_in)))
  }
}
