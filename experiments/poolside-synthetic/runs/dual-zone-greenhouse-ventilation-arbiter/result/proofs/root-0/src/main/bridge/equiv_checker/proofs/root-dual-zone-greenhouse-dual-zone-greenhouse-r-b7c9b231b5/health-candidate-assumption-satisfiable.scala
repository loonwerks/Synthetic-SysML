// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_b7c9b231b54a_Candidate_Assumption_Satisfiable {
  @pure def check(
      temperature_in: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      validity_in: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_Candidate_GumboX.compute_CEP_Pre(temperature_in, validity_in)))
  }
}
