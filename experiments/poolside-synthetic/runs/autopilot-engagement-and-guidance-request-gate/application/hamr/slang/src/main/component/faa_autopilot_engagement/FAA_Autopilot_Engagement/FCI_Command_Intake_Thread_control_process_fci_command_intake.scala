// #Sireum

package faa_autopilot_engagement.FAA_Autopilot_Engagement

import org.sireum._
import faa_autopilot_engagement._

// This file will not be overwritten if HAMR codegen is rerun
object FCI_Command_Intake_Thread_control_process_fci_command_intake {

  def initialise(api: FCI_Command_Intake_Thread_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.engage_ap_out == FAA_Autopilot_Engagement.Engage_AP_Command.Requested,
        api.command_status_out == FAA_Autopilot_Engagement.Engage_Command_Status.Valid
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // PART_01 initialisation: establish safe initial command intake outputs
    api.put_engage_ap_out(FAA_Autopilot_Engagement.Engage_AP_Command.Requested)
    api.put_command_status_out(FAA_Autopilot_Engagement.Engage_Command_Status.Valid)
  }

  def timeTriggered(api: FCI_Command_Intake_Thread_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_01_PRESERVE_ENGAGE_COMMAND
        //   set engage AP out to engage AP in
        api.engage_ap_out == api.engage_ap_in,
        // guarantee PART_01_PRESERVE_COMMAND_STATUS
        //   set command status out to command status in
        api.command_status_out == api.command_status_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_engage_ap_in: Option[FAA_Autopilot_Engagement.Engage_AP_Command.Type] = api.get_engage_ap_in()
    api.logInfo(s"Received on data port engage_ap_in: ${apiUsage_engage_ap_in}")
    val apiUsage_command_status_in: Option[FAA_Autopilot_Engagement.Engage_Command_Status.Type] = api.get_command_status_in()
    api.logInfo(s"Received on data port command_status_in: ${apiUsage_command_status_in}")

    // PART_01_PRESERVE_ENGAGE_COMMAND: set engage AP out to engage AP in
    api.put_engage_ap_out(api.engage_ap_in)
    // PART_01_PRESERVE_COMMAND_STATUS: set command status out to command status in
    api.put_command_status_out(api.command_status_in)
  }

  def finalise(api: FCI_Command_Intake_Thread_Operational_Api): Unit = { }
}
