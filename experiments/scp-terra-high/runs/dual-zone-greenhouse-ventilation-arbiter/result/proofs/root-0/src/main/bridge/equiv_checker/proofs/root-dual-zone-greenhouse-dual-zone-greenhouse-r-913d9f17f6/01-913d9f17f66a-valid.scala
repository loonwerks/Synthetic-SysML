// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_913d9f17f66a_1_Valid {
  @pure def check(
      temperature_in: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      temperature_out: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      validity_in: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type,
      validity_out: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_GumboX.compute_CEP_Pre(temperature_in, validity_in)) ___>: (equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_Candidate_GumboX.compute_CEP_Pre(temperature_in, validity_in))))
  }
}
