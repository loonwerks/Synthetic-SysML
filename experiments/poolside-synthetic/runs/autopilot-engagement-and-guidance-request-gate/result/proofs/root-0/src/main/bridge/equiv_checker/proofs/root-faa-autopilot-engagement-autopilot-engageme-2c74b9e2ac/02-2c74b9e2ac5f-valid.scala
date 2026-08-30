// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2c74b9e2ac5f_2_Valid {
  @pure def check(
      command_status_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      command_status_out: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      engage_ap_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type,
      engage_ap_out: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_Candidate_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, command_status_out, engage_ap_out))) ___>: (equiv_shared_0.FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_GumboX.compute_CEP_Post(command_status_in, engage_ap_in, command_status_out, engage_ap_out))) & T))
  }
}
