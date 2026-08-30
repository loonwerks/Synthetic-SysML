// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_56c201090cea_1_Valid {
  @pure def check(
      ap_guidance_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type,
      ap_guidance_request_out: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type,
      ap_on_in: equiv_shared_0.FAA_FCS_Coordination.AP_Enable.Type,
      ap_on_out: equiv_shared_0.FAA_FCS_Coordination.AP_Enable.Type,
      ap_status_in: equiv_shared_0.FAA_FCS_Coordination.AP_Status.Type,
      ap_status_out: equiv_shared_0.FAA_FCS_Coordination.AP_Status.Type,
      fcs_failed_in: equiv_shared_0.FAA_FCS_Coordination.FCS_Failed_Indication.Type,
      fcs_failed_out: equiv_shared_0.FAA_FCS_Coordination.FCS_Failed_Indication.Type,
      fd_on_in: equiv_shared_0.FAA_FCS_Coordination.FD_Indication.Type,
      fd_on_out: equiv_shared_0.FAA_FCS_Coordination.FD_Indication.Type,
      reference_sync_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type,
      reference_sync_request_out: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
