// #Sireum

package scp_candidate.FAA_Autopilot_Engagement

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Engagement_Decision_Thread_control_process_engagement_decision {

  def initialise(api: Engagement_Decision_Thread_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Engagement_Decision_Thread_Operational_Api): Unit = {
    Contract(Modifies(api))
    val engageAp = api.get_engage_ap().get
    val commandStatus = api.get_command_status().get
    val guidanceValid = api.get_guidance_valid().get
    val attitudeAcceptable = api.get_attitude_acceptable().get
    val apAvailability = api.get_ap_availability().get

    if (apAvailability == FAA_Autopilot_Engagement.AP_Availability.Failed) {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Failed)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (commandStatus == FAA_Autopilot_Engagement.Engage_Command_Status.Invalid) {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (engageAp == FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested) {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (attitudeAcceptable == FAA_Autopilot_Engagement.Attitude_Acceptability.Not_Acceptable) {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else if (guidanceValid == FAA_Autopilot_Engagement.Guidance_Readiness.Not_Ready) {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.Off)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Disabled)
    } else {
      api.put_ap_guidance_request(FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)
      api.put_ap_status(FAA_Autopilot_Engagement.AP_Status.On)
      api.put_ap_on(FAA_Autopilot_Engagement.AP_On_Indication.Enabled)
    }
  }

  def finalise(api: Engagement_Decision_Thread_Operational_Api): Unit = { }
}
