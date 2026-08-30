// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication {

  def initialise(api: FCS_Snapshot_Publication_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: FCS_Snapshot_Publication_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_fd_on_out(api.get_fd_on_in().get)
    api.put_fcs_failed_out(api.get_fcs_failed_in().get)
    api.put_ap_status_out(api.get_ap_status_in().get)
    api.put_ap_on_out(api.get_ap_on_in().get)
    api.put_ap_guidance_request_out(api.get_ap_guidance_request_in().get)
    api.put_reference_sync_request_out(api.get_reference_sync_request_in().get)
  }

  def finalise(api: FCS_Snapshot_Publication_i_Operational_Api): Unit = { }
}
