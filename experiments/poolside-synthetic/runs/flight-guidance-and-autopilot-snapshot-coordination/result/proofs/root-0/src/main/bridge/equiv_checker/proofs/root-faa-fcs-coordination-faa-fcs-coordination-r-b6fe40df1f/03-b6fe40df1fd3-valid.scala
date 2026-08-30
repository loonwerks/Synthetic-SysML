// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b6fe40df1fd3_3_Valid {
  @pure def check(
      attitude_acceptable_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_acceptable_out: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_data_in: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type,
      attitude_data_out: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
