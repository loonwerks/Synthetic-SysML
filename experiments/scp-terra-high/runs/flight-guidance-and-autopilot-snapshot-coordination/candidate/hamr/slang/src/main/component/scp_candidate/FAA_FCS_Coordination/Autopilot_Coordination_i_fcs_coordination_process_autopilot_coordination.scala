// #Sireum

package scp_candidate.FAA_FCS_Coordination

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination {

  def initialise(api: Autopilot_Coordination_i_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Autopilot_Coordination_i_Operational_Api): Unit = {
    Contract(Modifies(api))
    val engageRequest = api.get_qualified_engage_request().get
    val attitudeData = api.get_attitude_data().get
    val attitudeAcceptable = api.get_attitude_acceptable().get
    val referenceState = api.get_reference_state().get
    val apAvailability = api.get_ap_availability().get
    val fdOn = api.get_fd_on().get

    val qualifiedForAp =
      attitudeData == FAA_FCS_Coordination.Attitude_Data_Validity.Valid &&
        engageRequest == FAA_FCS_Coordination.Qualified_Request.Requested &&
        attitudeAcceptable == FAA_FCS_Coordination.Attitude_Acceptability.Acceptable &&
        fdOn == FAA_FCS_Coordination.FD_Indication.On

    api.put_reference_sync_trigger(
      if (attitudeData == FAA_FCS_Coordination.Attitude_Data_Validity.Valid &&
          engageRequest == FAA_FCS_Coordination.Qualified_Request.Requested &&
          attitudeAcceptable == FAA_FCS_Coordination.Attitude_Acceptability.Acceptable &&
          referenceState == FAA_FCS_Coordination.Reference_State.Not_Synchronized)
        FAA_FCS_Coordination.Request_Indication.Asserted
      else FAA_FCS_Coordination.Request_Indication.Not_Asserted)
    api.put_ap_status(
      if (apAvailability == FAA_FCS_Coordination.AP_Availability.Failed)
        FAA_FCS_Coordination.AP_Status.Failed
      else if (qualifiedForAp &&
               referenceState == FAA_FCS_Coordination.Reference_State.Synchronized)
        FAA_FCS_Coordination.AP_Status.On
      else FAA_FCS_Coordination.AP_Status.Off)
    api.put_ap_on(
      if (apAvailability == FAA_FCS_Coordination.AP_Availability.Available &&
          qualifiedForAp &&
          referenceState == FAA_FCS_Coordination.Reference_State.Synchronized)
        FAA_FCS_Coordination.AP_Enable.Enabled
      else FAA_FCS_Coordination.AP_Enable.Disabled)
    api.put_ap_guidance_request(
      if (apAvailability == FAA_FCS_Coordination.AP_Availability.Available &&
          qualifiedForAp &&
          referenceState == FAA_FCS_Coordination.Reference_State.Not_Synchronized)
        FAA_FCS_Coordination.Request_Indication.Asserted
      else FAA_FCS_Coordination.Request_Indication.Not_Asserted)
  }

  def finalise(api: Autopilot_Coordination_i_Operational_Api): Unit = { }
}
