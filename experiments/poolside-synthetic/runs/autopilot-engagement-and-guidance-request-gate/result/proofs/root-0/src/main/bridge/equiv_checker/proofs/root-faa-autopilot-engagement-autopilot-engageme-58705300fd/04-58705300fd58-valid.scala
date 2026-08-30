// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_58705300fd58_4_Valid {
  @pure def check(
      ap_availability: equiv_shared_0.FAA_Autopilot_Engagement.AP_Availability.Type,
      ap_guidance_request: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type,
      ap_on: equiv_shared_0.FAA_Autopilot_Engagement.AP_On_Indication.Type,
      ap_status: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type,
      attitude_acceptable: equiv_shared_0.FAA_Autopilot_Engagement.Attitude_Acceptability.Type,
      command_status: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      engage_ap: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type,
      guidance_valid: equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Readiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_GumboX.compute_CEP_Post(ap_availability, attitude_acceptable, command_status, engage_ap, guidance_valid, ap_guidance_request, ap_on, ap_status))) ___>: (T)) & T))
  }
}
