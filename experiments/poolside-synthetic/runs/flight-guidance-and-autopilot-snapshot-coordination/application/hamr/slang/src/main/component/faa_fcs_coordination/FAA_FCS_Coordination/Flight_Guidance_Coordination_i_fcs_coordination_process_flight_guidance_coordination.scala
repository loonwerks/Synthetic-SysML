// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination {

  def initialise(api: Flight_Guidance_Coordination_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: FD on Off, FCS failed Clear, reference sync request Not_Asserted
        api.fd_on == FAA_FCS_Coordination.FD_Indication.Off,
        api.fcs_failed == FAA_FCS_Coordination.FCS_Failed_Indication.Clear,
        api.reference_sync_request == FAA_FCS_Coordination.Request_Indication.Not_Asserted
        // END INITIALISE ENSURES
      )
    )
    api.put_fd_on(FAA_FCS_Coordination.FD_Indication.Off)
    api.put_fcs_failed(FAA_FCS_Coordination.FCS_Failed_Indication.Clear)
    api.put_reference_sync_request(FAA_FCS_Coordination.Request_Indication.Not_Asserted)
  }

  def timeTriggered(api: Flight_Guidance_Coordination_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_05_FD_ON_POLICY
        //   FD on to On exactly when attitude data is Valid and qualified display request is Requested
        (api.attitude_data == Attitude_Data_Validity.Valid &
          api.qualified_display_request == Qualified_Request.Requested ___>:
          api.fd_on == FD_Indication.On) &
          (api.fd_on == FD_Indication.On ___>:
            api.attitude_data == Attitude_Data_Validity.Valid &
              api.qualified_display_request == Qualified_Request.Requested),
        // guarantee PART_05_FCS_FAILED_POLICY
        //   FCS failed to Asserted exactly when attitude data is Invalid
        (api.attitude_data == Attitude_Data_Validity.Invalid ___>:
          api.fcs_failed == FCS_Failed_Indication.Asserted) &
          (api.fcs_failed == FCS_Failed_Indication.Asserted ___>:
            api.attitude_data == Attitude_Data_Validity.Invalid),
        // guarantee PART_05_REFERENCE_SYNC_POLICY
        //   reference sync request to Asserted exactly when attitude data is Valid and (qualified sync request is Requested or reference sync trigger is Asserted)
        (api.attitude_data == Attitude_Data_Validity.Valid &
          (api.qualified_sync_request == Qualified_Request.Requested |
            api.reference_sync_trigger == Request_Indication.Asserted) ___>:
          api.reference_sync_request == Request_Indication.Asserted) &
          (api.reference_sync_request == Request_Indication.Asserted ___>:
            api.attitude_data == Attitude_Data_Validity.Valid &
              (api.qualified_sync_request == Qualified_Request.Requested |
                api.reference_sync_trigger == Request_Indication.Asserted))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_display_request: Option[FAA_FCS_Coordination.Qualified_Request.Type] = api.get_qualified_display_request()
    api.logInfo(s"Received on data port qualified_display_request: ${apiUsage_qualified_display_request}")
    val apiUsage_qualified_sync_request: Option[FAA_FCS_Coordination.Qualified_Request.Type] = api.get_qualified_sync_request()
    api.logInfo(s"Received on data port qualified_sync_request: ${apiUsage_qualified_sync_request}")
    val apiUsage_attitude_data: Option[FAA_FCS_Coordination.Attitude_Data_Validity.Type] = api.get_attitude_data()
    api.logInfo(s"Received on data port attitude_data: ${apiUsage_attitude_data}")
    val apiUsage_attitude_acceptable: Option[FAA_FCS_Coordination.Attitude_Acceptability.Type] = api.get_attitude_acceptable()
    api.logInfo(s"Received on data port attitude_acceptable: ${apiUsage_attitude_acceptable}")
    val apiUsage_reference_state: Option[FAA_FCS_Coordination.Reference_State.Type] = api.get_reference_state()
    api.logInfo(s"Received on data port reference_state: ${apiUsage_reference_state}")
    val apiUsage_reference_sync_trigger: Option[FAA_FCS_Coordination.Request_Indication.Type] = api.get_reference_sync_trigger()
    api.logInfo(s"Received on data port reference_sync_trigger: ${apiUsage_reference_sync_trigger}")

    // PART_05_FD_ON_POLICY
    val fd_on_val: FAA_FCS_Coordination.FD_Indication.Type =
      if (apiUsage_attitude_data.get == Attitude_Data_Validity.Valid & apiUsage_qualified_display_request.get == Qualified_Request.Requested)
        FD_Indication.On
      else
        FD_Indication.Off
    api.put_fd_on(fd_on_val)

    // PART_05_FCS_FAILED_POLICY
    val fcs_failed_val: FAA_FCS_Coordination.FCS_Failed_Indication.Type =
      if (apiUsage_attitude_data.get == Attitude_Data_Validity.Invalid)
        FCS_Failed_Indication.Asserted
      else
        FCS_Failed_Indication.Clear
    api.put_fcs_failed(fcs_failed_val)

    // PART_05_REFERENCE_SYNC_POLICY
    val reference_sync_request_val: FAA_FCS_Coordination.Request_Indication.Type =
      if (apiUsage_attitude_data.get == Attitude_Data_Validity.Valid &
          (apiUsage_qualified_sync_request.get == Qualified_Request.Requested | apiUsage_reference_sync_trigger.get == Request_Indication.Asserted))
        Request_Indication.Asserted
      else
        Request_Indication.Not_Asserted
    api.put_reference_sync_request(reference_sync_request_val)
  }

  def finalise(api: Flight_Guidance_Coordination_i_Operational_Api): Unit = { }
}
