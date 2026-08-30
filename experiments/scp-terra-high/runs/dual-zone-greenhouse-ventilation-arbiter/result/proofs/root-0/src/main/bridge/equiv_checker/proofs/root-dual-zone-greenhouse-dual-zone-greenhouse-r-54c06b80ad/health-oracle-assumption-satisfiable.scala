// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_54c06b80ad3d_Oracle_Assumption_Satisfiable {
  @pure def check(
      temperature: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      upper_limit: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit,
      validity: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_GumboX.compute_CEP_Pre(temperature, upper_limit, validity)))
  }
}
