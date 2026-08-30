// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1b774150ca86_Oracle_Pointwise_Realizable {
  @pure def check(
      temperature: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius,
      upper_limit: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit,
      validity: equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Pre(temperature, upper_limit, validity)) ___>: ((equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible, equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Eligible, equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Asserted)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible, equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Clear)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_GumboX.compute_CEP_Post(temperature, upper_limit, validity, equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Ineligible, equiv_shared_0.Dual_Zone_Greenhouse.Sensor_Fault_Indication.Asserted)))))
  }
}
