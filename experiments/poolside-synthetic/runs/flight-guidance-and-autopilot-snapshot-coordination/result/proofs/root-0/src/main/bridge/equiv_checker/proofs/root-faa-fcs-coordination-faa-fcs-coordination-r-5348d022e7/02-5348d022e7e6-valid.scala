// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5348d022e7e6_2_Valid {
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
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_Candidate_GumboX.compute_CEP_Post(attitude_acceptable, attitude_data, qualified_display_request, qualified_sync_request, reference_state, reference_sync_trigger, fcs_failed, fd_on, reference_sync_request))) ___>: (equiv_shared_0.FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_GumboX.compute_CEP_Post(attitude_acceptable, attitude_data, qualified_display_request, qualified_sync_request, reference_state, reference_sync_trigger, fcs_failed, fd_on, reference_sync_request))) & T))
  }
}
