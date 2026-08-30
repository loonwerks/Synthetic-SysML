// #Sireum

package faa_autopilot_engagement.FAA_Autopilot_Engagement

import org.sireum._
import faa_autopilot_engagement._

// This file will not be overwritten if HAMR codegen is rerun
object Engagement_Decision_Thread_control_process_engagement_decision {

  def initialise(api: Engagement_Decision_Thread_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES
        // guarantee safe initial state: no guidance request, AP failed/off, AP on disabled
        api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested,
        api.ap_status == FAA_Autopilot_Engagement.AP_Status.Failed,
        api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled
        // END INITIALISE ENSURES
      )
    )

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // Engagement decision initialisation: establish safe initial outputs
    api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
    api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Failed)
    api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
  }

  def timeTriggered(api: Engagement_Decision_Thread_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case FAULT_01_FAILED
        //   if AP availability is Failed, set guidance request to Not Requested, AP status to Failed, AP on to Disabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Failed) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.Failed &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled),
        // case FAULT_02_INVALID_COMMAND
        //   if AP availability is Available and command status is Invalid, set guidance request to Not Requested, AP status to Off, AP on to Disabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Available &
         api.command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Invalid) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.Off &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled),
        // case BEH_01_NOT_REQUESTED
        //   if AP availability is Available, command status is Valid, and engage AP is Not Requested, set guidance request to Not Requested, AP status to Off, AP on to Disabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Available &
         api.command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Valid &
         api.engage_ap == FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.Off &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled),
        // case FAULT_03_ATTITUDE_NOT_ACCEPTABLE
        //   if AP availability is Available, command status is Valid, engage AP is Requested, and attitude is Not Acceptable, set guidance request to Not Requested, AP status to Off, AP on to Disabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Available &
         api.command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Valid &
         api.engage_ap == FAA_Autopilot_Engagement.Engage_AP_Command.Requested &
         api.attitude_acceptable == FAA_Autopilot_Engagement.Attitude_Acceptability.Not_Acceptable) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.Off &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled),
        // case BEH_02_WAITING_FOR_GUIDANCE
        //   if AP availability is Available, command status is Valid, engage AP is Requested, attitude is Acceptable, and guidance is Not Ready, set guidance request to Requested, AP status to Off, AP on to Disabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Available &
         api.command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Valid &
         api.engage_ap == FAA_Autopilot_Engagement.Engage_AP_Command.Requested &
         api.attitude_acceptable == FAA_Autopilot_Engagement.Attitude_Acceptability.Acceptable &
         api.guidance_valid == FAA_Autopilot_Engagement.Guidance_Readiness.Not_Ready) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.Off &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Disabled),
        // case BEH_03_ENGAGED
        //   if AP availability is Available, command status is Valid, engage AP is Requested, attitude is Acceptable, and guidance is Ready, set guidance request to Not Requested, AP status to On, AP on to Enabled
        (api.ap_availability == FAA_Autopilot_Engagement.AP_Availability.Available &
         api.command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Valid &
         api.engage_ap == FAA_Autopilot_Engagement.Engage_AP_Command.Requested &
         api.attitude_acceptable == FAA_Autopilot_Engagement.Attitude_Acceptability.Acceptable &
         api.guidance_valid == FAA_Autopilot_Engagement.Guidance_Readiness.Ready) ___>:
          (api.ap_guidance_request == FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested &
           api.ap_status == FAA_Autopilot_Engagement.AP_Status.On &
           api.ap_on == FAA_Autopilot_Engagement.AP_On_Indication.Enabled)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val engage_ap: FAA_Autopilot_Engagement.Engage_AP_Command.Type = api.get_engage_ap().get
    val command_status: FAA_Autopilot_Engagement.Engage_Command_Status.Type = api.get_command_status().get
    val guidance_valid: FAA_Autopilot_Engagement.Guidance_Readiness.Type = api.get_guidance_valid().get
    val attitude_acceptable: FAA_Autopilot_Engagement.Attitude_Acceptability.Type = api.get_attitude_acceptable().get
    val ap_availability: FAA_Autopilot_Engagement.AP_Availability.Type = api.get_ap_availability().get

    api.logInfo(s"Received on data port engage_ap: ${Some(engage_ap)}")
    api.logInfo(s"Received on data port command_status: ${Some(command_status)}")
    api.logInfo(s"Received on data port guidance_valid: ${Some(guidance_valid)}")
    api.logInfo(s"Received on data port attitude_acceptable: ${Some(attitude_acceptable)}")
    api.logInfo(s"Received on data port ap_availability: ${Some(ap_availability)}")

    if (ap_availability == FAA_Autopilot_Engagement.AP_Availability.Failed) {
      // FAULT_01_FAILED
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Failed)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (command_status == FAA_Autopilot_Engagement.Engage_Command_Status.Invalid) {
      // FAULT_02_INVALID_COMMAND
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (engage_ap == FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested) {
      // BEH_01_NOT_REQUESTED
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (attitude_acceptable == FAA_Autopilot_Engagement.Attitude_Acceptability.Not_Acceptable) {
      // FAULT_03_ATTITUDE_NOT_ACCEPTABLE
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (guidance_valid == FAA_Autopilot_Engagement.Guidance_Readiness.Not_Ready) {
      // BEH_02_WAITING_FOR_GUIDANCE
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else {
      // BEH_03_ENGAGED
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.On)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Enabled)
    }
  }

  def finalise(api: Engagement_Decision_Thread_Operational_Api): Unit = { }
}
