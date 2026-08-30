// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake {

  def initialise(api: FCI_Command_Intake_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: FCI_Command_Intake_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    val displayRequest = api.get_display_fd_request_in().get
    val displayValidity = api.get_display_fd_validity_in().get
    val syncRequest = api.get_sync_fd_request_in().get
    val syncValidity = api.get_sync_fd_validity_in().get
    val engageRequest = api.get_engage_ap_request_in().get
    val engageValidity = api.get_engage_ap_validity_in().get

    api.put_qualified_display_request(
      if (displayRequest == FAA_FCS_Coordination.Request_Value.Requested &&
          displayValidity == FAA_FCS_Coordination.Input_Validity.Valid)
        FAA_FCS_Coordination.Qualified_Request.Requested
      else FAA_FCS_Coordination.Qualified_Request.Not_Requested)
    api.put_qualified_sync_request(
      if (syncRequest == FAA_FCS_Coordination.Request_Value.Requested &&
          syncValidity == FAA_FCS_Coordination.Input_Validity.Valid)
        FAA_FCS_Coordination.Qualified_Request.Requested
      else FAA_FCS_Coordination.Qualified_Request.Not_Requested)
    api.put_qualified_engage_request(
      if (engageRequest == FAA_FCS_Coordination.Request_Value.Requested &&
          engageValidity == FAA_FCS_Coordination.Input_Validity.Valid)
        FAA_FCS_Coordination.Qualified_Request.Requested
      else FAA_FCS_Coordination.Qualified_Request.Not_Requested)
  }

  def finalise(api: FCI_Command_Intake_i_Operational_Api): Unit = { }
}
