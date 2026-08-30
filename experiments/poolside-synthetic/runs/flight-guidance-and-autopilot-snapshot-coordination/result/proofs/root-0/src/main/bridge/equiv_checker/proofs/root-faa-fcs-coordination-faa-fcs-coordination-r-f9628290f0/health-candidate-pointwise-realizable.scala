// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f9628290f066_Candidate_Pointwise_Realizable {
  @pure def check(
      display_fd_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      display_fd_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type,
      engage_ap_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      engage_ap_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type,
      sync_fd_request_in: equiv_shared_0.FAA_FCS_Coordination.Request_Value.Type,
      sync_fd_validity_in: equiv_shared_0.FAA_FCS_Coordination.Input_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Requested)) |
        (equiv_shared_0.FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(display_fd_request_in, display_fd_validity_in, engage_ap_request_in, engage_ap_validity_in, sync_fd_request_in, sync_fd_validity_in, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested, equiv_shared_0.FAA_FCS_Coordination.Qualified_Request.Not_Requested)))))
  }
}
