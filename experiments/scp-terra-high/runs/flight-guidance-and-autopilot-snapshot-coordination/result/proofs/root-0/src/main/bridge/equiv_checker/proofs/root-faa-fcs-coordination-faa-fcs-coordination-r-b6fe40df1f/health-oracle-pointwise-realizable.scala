// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_b6fe40df1fd3_Oracle_Pointwise_Realizable {
  @pure def check(
      attitude_acceptable_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_data_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Acceptable, equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Valid)) |
        (equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Acceptable, equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Invalid)) |
        (equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Not_Acceptable, equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Valid)) |
        (equiv_shared_0.FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_GumboX.compute_CEP_Post(attitude_acceptable_in, attitude_data_in, equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Not_Acceptable, equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Invalid)))))
  }
}
