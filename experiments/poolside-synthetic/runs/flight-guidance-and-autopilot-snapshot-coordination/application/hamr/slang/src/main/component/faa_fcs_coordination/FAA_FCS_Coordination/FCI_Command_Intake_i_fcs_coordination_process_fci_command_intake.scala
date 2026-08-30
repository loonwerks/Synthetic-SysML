// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake {

  def initialise(api: FCI_Command_Intake_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: all qualified requests are Not_Requested
        api.qualified_display_request == FAA_FCS_Coordination.Qualified_Request.Not_Requested,
        api.qualified_sync_request == FAA_FCS_Coordination.Qualified_Request.Not_Requested,
        api.qualified_engage_request == FAA_FCS_Coordination.Qualified_Request.Not_Requested
        // END INITIALISE ENSURES
      )
    )
    api.put_qualified_display_request(FAA_FCS_Coordination.Qualified_Request.Not_Requested)
    api.put_qualified_sync_request(FAA_FCS_Coordination.Qualified_Request.Not_Requested)
    api.put_qualified_engage_request(FAA_FCS_Coordination.Qualified_Request.Not_Requested)
  }

  def timeTriggered(api: FCI_Command_Intake_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_01_QUALIFY_DISPLAY
        //   qualified display request to Requested exactly when display FD request in is Requested and display FD validity in is Valid
        (api.display_fd_request_in == Request_Value.Requested &
          api.display_fd_validity_in == Input_Validity.Valid ___>:
          api.qualified_display_request == Qualified_Request.Requested) &
          (api.qualified_display_request == Qualified_Request.Requested ___>:
            api.display_fd_request_in == Request_Value.Requested &
              api.display_fd_validity_in == Input_Validity.Valid),
        // guarantee PART_01_QUALIFY_SYNC
        //   qualified sync request to Requested exactly when sync FD request in is Requested and sync FD validity in is Valid
        (api.sync_fd_request_in == Request_Value.Requested &
          api.sync_fd_validity_in == Input_Validity.Valid ___>:
          api.qualified_sync_request == Qualified_Request.Requested) &
          (api.qualified_sync_request == Qualified_Request.Requested ___>:
            api.sync_fd_request_in == Request_Value.Requested &
              api.sync_fd_validity_in == Input_Validity.Valid),
        // guarantee PART_01_QUALIFY_ENGAGE
        //   qualified engage request to Requested exactly when engage AP request in is Requested and engage AP validity in is Valid
        (api.engage_ap_request_in == Request_Value.Requested &
          api.engage_ap_validity_in == Input_Validity.Valid ___>:
          api.qualified_engage_request == Qualified_Request.Requested) &
          (api.qualified_engage_request == Qualified_Request.Requested ___>:
            api.engage_ap_request_in == Request_Value.Requested &
              api.engage_ap_validity_in == Input_Validity.Valid)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_display_fd_request_in: Option[FAA_FCS_Coordination.Request_Value.Type] = api.get_display_fd_request_in()
    api.logInfo(s"Received on data port display_fd_request_in: ${apiUsage_display_fd_request_in}")
    val apiUsage_display_fd_validity_in: Option[FAA_FCS_Coordination.Input_Validity.Type] = api.get_display_fd_validity_in()
    api.logInfo(s"Received on data port display_fd_validity_in: ${apiUsage_display_fd_validity_in}")
    val apiUsage_sync_fd_request_in: Option[FAA_FCS_Coordination.Request_Value.Type] = api.get_sync_fd_request_in()
    api.logInfo(s"Received on data port sync_fd_request_in: ${apiUsage_sync_fd_request_in}")
    val apiUsage_sync_fd_validity_in: Option[FAA_FCS_Coordination.Input_Validity.Type] = api.get_sync_fd_validity_in()
    api.logInfo(s"Received on data port sync_fd_validity_in: ${apiUsage_sync_fd_validity_in}")
    val apiUsage_engage_ap_request_in: Option[FAA_FCS_Coordination.Request_Value.Type] = api.get_engage_ap_request_in()
    api.logInfo(s"Received on data port engage_ap_request_in: ${apiUsage_engage_ap_request_in}")
    val apiUsage_engage_ap_validity_in: Option[FAA_FCS_Coordination.Input_Validity.Type] = api.get_engage_ap_validity_in()
    api.logInfo(s"Received on data port engage_ap_validity_in: ${apiUsage_engage_ap_validity_in}")

    // PART_01_QUALIFY_DISPLAY
    val qualified_display_request_val: FAA_FCS_Coordination.Qualified_Request.Type =
      if (apiUsage_display_fd_request_in.get == Request_Value.Requested & apiUsage_display_fd_validity_in.get == Input_Validity.Valid)
        Qualified_Request.Requested
      else
        Qualified_Request.Not_Requested
    api.put_qualified_display_request(qualified_display_request_val)

    // PART_01_QUALIFY_SYNC
    val qualified_sync_request_val: FAA_FCS_Coordination.Qualified_Request.Type =
      if (apiUsage_sync_fd_request_in.get == Request_Value.Requested & apiUsage_sync_fd_validity_in.get == Input_Validity.Valid)
        Qualified_Request.Requested
      else
        Qualified_Request.Not_Requested
    api.put_qualified_sync_request(qualified_sync_request_val)

    // PART_01_QUALIFY_ENGAGE
    val qualified_engage_request_val: FAA_FCS_Coordination.Qualified_Request.Type =
      if (apiUsage_engage_ap_request_in.get == Request_Value.Requested & apiUsage_engage_ap_validity_in.get == Input_Validity.Valid)
        Qualified_Request.Requested
      else
        Qualified_Request.Not_Requested
    api.put_qualified_engage_request(qualified_engage_request_val)
  }

  def finalise(api: FCI_Command_Intake_i_Operational_Api): Unit = { }
}
