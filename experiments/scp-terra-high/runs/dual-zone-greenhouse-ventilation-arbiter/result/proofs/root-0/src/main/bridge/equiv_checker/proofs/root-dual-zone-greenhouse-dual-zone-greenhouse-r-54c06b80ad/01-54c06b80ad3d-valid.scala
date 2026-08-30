// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_54c06b80ad3d_1_Valid {
  @pure def check(
      eligibility: equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Type,
      sensor_fault: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type,
      temperature: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      upper_limit: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit,
      validity: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_GumboX.compute_CEP_Pre(temperature, upper_limit, validity)) ___>: (equiv_shared_0.Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_Candidate_GumboX.compute_CEP_Pre(temperature, upper_limit, validity))))
  }
}
