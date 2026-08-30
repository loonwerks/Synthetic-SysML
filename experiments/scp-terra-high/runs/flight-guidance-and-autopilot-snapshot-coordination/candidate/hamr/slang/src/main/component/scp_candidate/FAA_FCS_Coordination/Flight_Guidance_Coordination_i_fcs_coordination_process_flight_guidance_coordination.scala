// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination {

  def initialise(api: Flight_Guidance_Coordination_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Flight_Guidance_Coordination_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    val displayRequest = api.get_qualified_display_request().get
    val syncRequest = api.get_qualified_sync_request().get
    val attitudeData = api.get_attitude_data().get
    val referenceSyncTrigger = api.get_reference_sync_trigger().get

    api.put_fd_on(
      if (attitudeData == FAA_FCS_Coordination.Attitude_Data_Validity.Valid &&
          displayRequest == FAA_FCS_Coordination.Qualified_Request.Requested)
        FAA_FCS_Coordination.FD_Indication.On
      else FAA_FCS_Coordination.FD_Indication.Off)
    api.put_fcs_failed(
      if (attitudeData == FAA_FCS_Coordination.Attitude_Data_Validity.Invalid)
        FAA_FCS_Coordination.FCS_Failed_Indication.Asserted
      else FAA_FCS_Coordination.FCS_Failed_Indication.Clear)
    api.put_reference_sync_request(
      if (attitudeData == FAA_FCS_Coordination.Attitude_Data_Validity.Valid &&
          (syncRequest == FAA_FCS_Coordination.Qualified_Request.Requested ||
            referenceSyncTrigger == FAA_FCS_Coordination.Request_Indication.Asserted))
        FAA_FCS_Coordination.Request_Indication.Asserted
      else FAA_FCS_Coordination.Request_Indication.Not_Asserted)
  }

  def finalise(api: Flight_Guidance_Coordination_i_Operational_Api): Unit = { }
}
