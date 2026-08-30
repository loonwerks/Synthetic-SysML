// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5e0394a25712_2_Valid {
  @pure def check(
      ap_availability: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type,
      ap_guidance_request: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type,
      ap_on: equiv_shared_0.FAA_FCS_Coordination.AP_Enable.Type,
      ap_status: equiv_shared_0.FAA_FCS_Coordination.AP_Status.Type,
      attitude_acceptable: equiv_shared_0.FAA_FCS_Coordination.Attitude_Acceptability.Type,
      attitude_data: equiv_shared_0.FAA_FCS_Coordination.Attitude_Data_Validity.Type,
      fd_on: equiv_shared_0.FAA_FCS_Coordination.FD_Indication.Type,
      qualified_engage_request: equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Type,
      reference_state: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type,
      reference_sync_trigger: equiv_shared_0.FAA_FCS_Coordination.Request_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_Candidate_GumboX.compute_CEP_Post(ap_availability, attitude_acceptable, attitude_data, fd_on, qualified_engage_request, reference_state, ap_guidance_request, ap_on, ap_status, reference_sync_trigger))) ___>: (equiv_shared_0.FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_GumboX.compute_CEP_Post(ap_availability, attitude_acceptable, attitude_data, fd_on, qualified_engage_request, reference_state, ap_guidance_request, ap_on, ap_status, reference_sync_trigger))) & T))
  }
}
