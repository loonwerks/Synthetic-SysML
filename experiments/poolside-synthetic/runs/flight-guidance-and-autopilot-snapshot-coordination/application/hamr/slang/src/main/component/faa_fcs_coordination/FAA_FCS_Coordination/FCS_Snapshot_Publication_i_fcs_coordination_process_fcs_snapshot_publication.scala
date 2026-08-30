// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication {

  def initialise(api: FCS_Snapshot_Publication_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: all outputs in safe/default state
        api.fd_on_out == FAA_FCS_Coordination.FD_Indication.Off,
        api.fcs_failed_out == FAA_FCS_Coordination.FCS_Failed_Indication.Clear,
        api.ap_status_out == FAA_FCS_Coordination.AP_Status.Off,
        api.ap_on_out == FAA_FCS_Coordination.AP_Enable.Disabled,
        api.ap_guidance_request_out == FAA_FCS_Coordination.Request_Indication.Not_Asserted,
        api.reference_sync_request_out == FAA_FCS_Coordination.Request_Indication.Not_Asserted
        // END INITIALISE ENSURES
      )
    )
    api.put_fd_on_out(FAA_FCS_Coordination.FD_Indication.Off)
    api.put_fcs_failed_out(FAA_FCS_Coordination.FCS_Failed_Indication.Clear)
    api.put_ap_status_out(FAA_FCS_Coordination.AP_Status.Off)
    api.put_ap_on_out(FAA_FCS_Coordination.AP_Enable.Disabled)
    api.put_ap_guidance_request_out(FAA_FCS_Coordination.Request_Indication.Not_Asserted)
    api.put_reference_sync_request_out(FAA_FCS_Coordination.Request_Indication.Not_Asserted)
  }

  def timeTriggered(api: FCS_Snapshot_Publication_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_07_PRESERVE_FD_ON
        //   FD on out to FD on in
        api.fd_on_out == api.fd_on_in,
        // guarantee PART_07_PRESERVE_FCS_FAILED
        //   FCS failed out to FCS failed in
        api.fcs_failed_out == api.fcs_failed_in,
        // guarantee PART_07_PRESERVE_AP_STATUS
        //   AP status out to AP status in
        api.ap_status_out == api.ap_status_in,
        // guarantee PART_07_PRESERVE_AP_ON
        //   AP on out to AP on in
        api.ap_on_out == api.ap_on_in,
        // guarantee PART_07_PRESERVE_AP_GUIDANCE_REQUEST
        //   AP guidance request out to AP guidance request in
        api.ap_guidance_request_out == api.ap_guidance_request_in,
        // guarantee PART_07_PRESERVE_REFERENCE_SYNC_REQUEST
        //   reference sync request out to reference sync request in
        api.reference_sync_request_out == api.reference_sync_request_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_fd_on_in: Option[FAA_FCS_Coordination.FD_Indication.Type] = api.get_fd_on_in()
    api.logInfo(s"Received on data port fd_on_in: ${apiUsage_fd_on_in}")
    val apiUsage_fcs_failed_in: Option[FAA_FCS_Coordination.FCS_Failed_Indication.Type] = api.get_fcs_failed_in()
    api.logInfo(s"Received on data port fcs_failed_in: ${apiUsage_fcs_failed_in}")
    val apiUsage_ap_status_in: Option[FAA_FCS_Coordination.AP_Status.Type] = api.get_ap_status_in()
    api.logInfo(s"Received on data port ap_status_in: ${apiUsage_ap_status_in}")
    val apiUsage_ap_on_in: Option[FAA_FCS_Coordination.AP_Enable.Type] = api.get_ap_on_in()
    api.logInfo(s"Received on data port ap_on_in: ${apiUsage_ap_on_in}")
    val apiUsage_ap_guidance_request_in: Option[FAA_FCS_Coordination.Request_Indication.Type] = api.get_ap_guidance_request_in()
    api.logInfo(s"Received on data port ap_guidance_request_in: ${apiUsage_ap_guidance_request_in}")
    val apiUsage_reference_sync_request_in: Option[FAA_FCS_Coordination.Request_Indication.Type] = api.get_reference_sync_request_in()
    api.logInfo(s"Received on data port reference_sync_request_in: ${apiUsage_reference_sync_request_in}")

    // PART_07_PRESERVE_FD_ON
    api.put_fd_on_out(apiUsage_fd_on_in.get)
    // PART_07_PRESERVE_FCS_FAILED
    api.put_fcs_failed_out(apiUsage_fcs_failed_in.get)
    // PART_07_PRESERVE_AP_STATUS
    api.put_ap_status_out(apiUsage_ap_status_in.get)
    // PART_07_PRESERVE_AP_ON
    api.put_ap_on_out(apiUsage_ap_on_in.get)
    // PART_07_PRESERVE_AP_GUIDANCE_REQUEST
    api.put_ap_guidance_request_out(apiUsage_ap_guidance_request_in.get)
    // PART_07_PRESERVE_REFERENCE_SYNC_REQUEST
    api.put_reference_sync_request_out(apiUsage_reference_sync_request_in.get)
  }

  def finalise(api: FCS_Snapshot_Publication_i_Operational_Api): Unit = { }
}
