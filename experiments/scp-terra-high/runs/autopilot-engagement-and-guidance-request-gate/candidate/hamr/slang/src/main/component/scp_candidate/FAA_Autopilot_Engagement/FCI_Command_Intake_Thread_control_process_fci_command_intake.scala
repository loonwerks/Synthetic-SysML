// #Sireum

package scp_candidate.FAA_Autopilot_Engagement

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FCI_Command_Intake_Thread_control_process_fci_command_intake {

  def initialise(api: FCI_Command_Intake_Thread_Initialization_Api): Unit = {
  }

  def timeTriggered(api: FCI_Command_Intake_Thread_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_engage_ap_out(api.get_engage_ap_in().get)
    api.put_command_status_out(api.get_command_status_in().get)
  }

  def finalise(api: FCI_Command_Intake_Thread_Operational_Api): Unit = { }
}
