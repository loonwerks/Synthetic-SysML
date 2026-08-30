// #Sireum

package faa_fcs_coordination.FAA_FCS_Coordination

import org.sireum._
import faa_fcs_coordination._

// This file will not be overwritten if HAMR codegen is rerun
object Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination {

  def initialise(api: Autopilot_Coordination_i_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // safe-state initialization: reference sync trigger Not_Asserted, AP status Off, AP on Disabled, AP guidance request Not_Asserted
        api.reference_sync_trigger == FAA_FCS_Coordination.Request_Indication.Not_Asserted,
        api.ap_status == FAA_FCS_Coordination.AP_Status.Off,
        api.ap_on == FAA_FCS_Coordination.AP_Enable.Disabled,
        api.ap_guidance_request == FAA_FCS_Coordination.Request_Indication.Not_Asserted
        // END INITIALISE ENSURES
      )
    )
    api.put_reference_sync_trigger(FAA_FCS_Coordination.Request_Indication.Not_Asserted)
    api.put_ap_status(FAA_FCS_Coordination.AP_Status.Off)
    api.put_ap_on(FAA_FCS_Coordination.AP_Enable.Disabled)
    api.put_ap_guidance_request(FAA_FCS_Coordination.Request_Indication.Not_Asserted)
  }

  def timeTriggered(api: Autopilot_Coordination_i_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PART_06_REFERENCE_SYNC_TRIGGER
        //   reference sync trigger to Asserted exactly when attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and reference state is Not Synchronized
        (api.attitude_data == Attitude_Data_Validity.Valid &
          api.qualified_engage_request == Qualified_Request.Requested &
          api.attitude_acceptable == Attitude_Acceptability.Acceptable &
          api.reference_state == Reference_State.Not_Synchronized ___>:
          api.reference_sync_trigger == Request_Indication.Asserted) &
          (api.reference_sync_trigger == Request_Indication.Asserted ___>:
            api.attitude_data == Attitude_Data_Validity.Valid &
              api.qualified_engage_request == Qualified_Request.Requested &
              api.attitude_acceptable == Attitude_Acceptability.Acceptable &
              api.reference_state == Reference_State.Not_Synchronized),
        // case PART_06_AP_UNAVAILABLE
        //   if AP availability is Failed, AP status to Failed, AP on to Disabled, AP guidance request to Not Asserted
        (api.ap_availability == AP_Availability.Failed) ___>: (api.ap_status == AP_Status.Failed &
          api.ap_on == AP_Enable.Disabled &
          api.ap_guidance_request == Request_Indication.Not_Asserted),
        // case PART_06_AP_ENGAGED_SYNCHRONIZED
        //   if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Synchronized, AP status to On, AP on to Enabled, AP guidance request to Not Asserted
        (api.ap_availability == AP_Availability.Available &
          api.attitude_data == Attitude_Data_Validity.Valid &
          api.qualified_engage_request == Qualified_Request.Requested &
          api.attitude_acceptable == Attitude_Acceptability.Acceptable &
          api.fd_on == FD_Indication.On &
          api.reference_state == Reference_State.Synchronized) ___>: (api.ap_status == AP_Status.On &
          api.ap_on == AP_Enable.Enabled &
          api.ap_guidance_request == Request_Indication.Not_Asserted),
        // case PART_06_AP_WAITING_FOR_REFERENCE
        //   if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Not Synchronized, AP status to Off, AP on to Disabled, AP guidance request to Asserted
        (api.ap_availability == AP_Availability.Available &
          api.attitude_data == Attitude_Data_Validity.Valid &
          api.qualified_engage_request == Qualified_Request.Requested &
          api.attitude_acceptable == Attitude_Acceptability.Acceptable &
          api.fd_on == FD_Indication.On &
          api.reference_state == Reference_State.Not_Synchronized) ___>: (api.ap_status == AP_Status.Off &
          api.ap_on == AP_Enable.Disabled &
          api.ap_guidance_request == Request_Indication.Asserted),
        // case PART_06_AP_AVAILABLE_OTHERWISE
        //   if AP availability is Available and it is not the case that attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and FD on is On, AP status to Off, AP on to Disabled, AP guidance request to Not Asserted
        (api.ap_availability == AP_Availability.Available &
          !(api.attitude_data == Attitude_Data_Validity.Valid &
            api.qualified_engage_request == Qualified_Request.Requested &
            api.attitude_acceptable == Attitude_Acceptability.Acceptable &
            api.fd_on == FD_Indication.On)) ___>: (api.ap_status == AP_Status.Off &
          api.ap_on == AP_Enable.Disabled &
          api.ap_guidance_request == Request_Indication.Not_Asserted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_engage_request: Option[FAA_FCS_Coordination.Qualified_Request.Type] = api.get_qualified_engage_request()
    api.logInfo(s"Received on data port qualified_engage_request: ${apiUsage_qualified_engage_request}")
    val apiUsage_attitude_data: Option[FAA_FCS_Coordination.Attitude_Data_Validity.Type] = api.get_attitude_data()
    api.logInfo(s"Received on data port attitude_data: ${apiUsage_attitude_data}")
    val apiUsage_attitude_acceptable: Option[FAA_FCS_Coordination.Attitude_Acceptability.Type] = api.get_attitude_acceptable()
    api.logInfo(s"Received on data port attitude_acceptable: ${apiUsage_attitude_acceptable}")
    val apiUsage_reference_state: Option[FAA_FCS_Coordination.Reference_State.Type] = api.get_reference_state()
    api.logInfo(s"Received on data port reference_state: ${apiUsage_reference_state}")
    val apiUsage_ap_availability: Option[FAA_FCS_Coordination.AP_Availability.Type] = api.get_ap_availability()
    api.logInfo(s"Received on data port ap_availability: ${apiUsage_ap_availability}")
    val apiUsage_fd_on: Option[FAA_FCS_Coordination.FD_Indication.Type] = api.get_fd_on()
    api.logInfo(s"Received on data port fd_on: ${apiUsage_fd_on}")

    // PART_06_REFERENCE_SYNC_TRIGGER
    val reference_sync_trigger_val: FAA_FCS_Coordination.Request_Indication.Type =
      if (apiUsage_attitude_data.get == Attitude_Data_Validity.Valid &
          apiUsage_qualified_engage_request.get == Qualified_Request.Requested &
          apiUsage_attitude_acceptable.get == Attitude_Acceptability.Acceptable &
          apiUsage_reference_state.get == Reference_State.Not_Synchronized)
        Request_Indication.Asserted
      else
        Request_Indication.Not_Asserted
    api.put_reference_sync_trigger(reference_sync_trigger_val)

    // PART_06 cases for ap_status, ap_on, ap_guidance_request
    if (apiUsage_ap_availability.get == AP_Availability.Failed) {
      // PART_06_AP_UNAVAILABLE
      api.put_ap_status(AP_Status.Failed)
      api.put_ap_on(AP_Enable.Disabled)
      api.put_ap_guidance_request(Request_Indication.Not_Asserted)
    } else if (apiUsage_ap_availability.get == AP_Availability.Available &
               apiUsage_attitude_data.get == Attitude_Data_Validity.Valid &
               apiUsage_qualified_engage_request.get == Qualified_Request.Requested &
               apiUsage_attitude_acceptable.get == Attitude_Acceptability.Acceptable &
               apiUsage_fd_on.get == FD_Indication.On &
               apiUsage_reference_state.get == Reference_State.Synchronized) {
      // PART_06_AP_ENGAGED_SYNCHRONIZED
      api.put_ap_status(AP_Status.On)
      api.put_ap_on(AP_Enable.Enabled)
      api.put_ap_guidance_request(Request_Indication.Not_Asserted)
    } else if (apiUsage_ap_availability.get == AP_Availability.Available &
               apiUsage_attitude_data.get == Attitude_Data_Validity.Valid &
               apiUsage_qualified_engage_request.get == Qualified_Request.Requested &
               apiUsage_attitude_acceptable.get == Attitude_Acceptability.Acceptable &
               apiUsage_fd_on.get == FD_Indication.On &
               apiUsage_reference_state.get == Reference_State.Not_Synchronized) {
      // PART_06_AP_WAITING_FOR_REFERENCE
      api.put_ap_status(AP_Status.Off)
      api.put_ap_on(AP_Enable.Disabled)
      api.put_ap_guidance_request(Request_Indication.Asserted)
    } else {
      // PART_06_AP_AVAILABLE_OTHERWISE
      api.put_ap_status(AP_Status.Off)
      api.put_ap_on(AP_Enable.Disabled)
      api.put_ap_guidance_request(Request_Indication.Not_Asserted)
    }
  }

  def finalise(api: Autopilot_Coordination_i_Operational_Api): Unit = { }
}
