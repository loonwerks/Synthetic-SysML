// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_11badf8332e6_Candidate_Pointwise_Realizable {
  @pure def check(
      preference: equiv_shared_0.Dual_Zone_Greenhouse.Contention_Preference.Type,
      zone_a_eligibility: equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Type,
      zone_b_eligibility: equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Candidate_GumboX.compute_CEP_Post(preference, zone_a_eligibility, zone_b_eligibility, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.On, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.On)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Candidate_GumboX.compute_CEP_Post(preference, zone_a_eligibility, zone_b_eligibility, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.On, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Off)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Candidate_GumboX.compute_CEP_Post(preference, zone_a_eligibility, zone_b_eligibility, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Off, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.On)) |
        (equiv_shared_0.Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Candidate_GumboX.compute_CEP_Post(preference, zone_a_eligibility, zone_b_eligibility, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Off, equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Off)))))
  }
}
