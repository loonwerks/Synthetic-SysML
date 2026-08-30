// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_56c201090cea_2_Valid {
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
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_Candidate_GumboX.compute_CEP_Post(ap_guidance_request_in, ap_on_in, ap_status_in, fcs_failed_in, fd_on_in, reference_sync_request_in, ap_guidance_request_out, ap_on_out, ap_status_out, fcs_failed_out, fd_on_out, reference_sync_request_out))) ___>: (equiv_shared_0.FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_GumboX.compute_CEP_Post(ap_guidance_request_in, ap_on_in, ap_status_in, fcs_failed_in, fd_on_in, reference_sync_request_in, ap_guidance_request_out, ap_on_out, ap_status_out, fcs_failed_out, fd_on_out, reference_sync_request_out))) & T))
  }
}
