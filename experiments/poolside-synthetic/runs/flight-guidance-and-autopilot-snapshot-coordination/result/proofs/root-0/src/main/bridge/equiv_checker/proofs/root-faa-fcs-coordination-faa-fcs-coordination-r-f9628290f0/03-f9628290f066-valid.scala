// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f9628290f066_3_Valid {
  @pure def check(
      display_fd_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      display_fd_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type,
      engage_ap_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      engage_ap_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type,
      qualified_display_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      qualified_engage_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      qualified_sync_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      sync_fd_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      sync_fd_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
