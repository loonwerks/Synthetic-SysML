// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dbb93c969da8_1_Valid {
  @pure def check(
      preference_in: equiv_shared_0.Dual_Zone_Greenhouse.Contention_Preference.Type,
      preference_out: equiv_shared_0.Dual_Zone_Greenhouse.Contention_Preference.Type,
      upper_limit_for_a: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit,
      upper_limit_for_b: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit,
      upper_limit_in: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit): Unit = {
    Contract(Requires(T),
      Ensures((equiv_shared_0.Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_GumboX.compute_CEP_Pre(preference_in, upper_limit_in)) ___>: (equiv_shared_0.Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_Candidate_GumboX.compute_CEP_Pre(preference_in, upper_limit_in))))
  }
}
