// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5348d022e7e6_3_Valid {
  @pure def check(
      attitude_acceptable: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_data: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type,
      fcs_failed: equiv_shared_0.FAA_FCS_Coordination.FCS_Failed_Indication.Type,
      fd_on: equiv_shared_0.FAA_FCS_Coordination.FD_Indication.Type,
      qualified_display_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      qualified_sync_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      reference_state: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type,
      reference_sync_request: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type,
      reference_sync_trigger: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
