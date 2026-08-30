// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_2c74b9e2ac5f_Candidate_Pointwise_Realizable {
  @pure def check(
      command_status_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      engage_ap_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Valid, equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Requested)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Valid, equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Invalid, equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Requested)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Invalid, equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested)))))
  }
}
