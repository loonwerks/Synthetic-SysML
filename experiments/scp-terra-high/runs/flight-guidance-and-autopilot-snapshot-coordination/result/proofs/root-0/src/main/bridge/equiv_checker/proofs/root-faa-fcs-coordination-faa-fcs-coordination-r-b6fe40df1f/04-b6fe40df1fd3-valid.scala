// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b6fe40df1fd3_4_Valid {
  @pure def check(
      attitude_acceptable_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_acceptable_out: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_data_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type,
      attitude_data_out: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, attitude_acceptable_out, attitude_data_out))) ___>: (equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_Candidate_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, attitude_acceptable_out, attitude_data_out))) & T))
  }
}
