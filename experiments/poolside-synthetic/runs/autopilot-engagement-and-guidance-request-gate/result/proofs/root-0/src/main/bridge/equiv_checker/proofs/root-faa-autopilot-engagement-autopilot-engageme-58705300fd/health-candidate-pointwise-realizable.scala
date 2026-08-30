// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_58705300fd58_Candidate_Pointwise_Realizable {
  @pure def check(
      ap_availability: equiv_shared_0.FAA_Autopilot_Engagement.AP_Availability.Type,
      attitude_acceptable: equiv_shared_0.FAA_Autopilot_Engagement.Attitude_Acceptability.Type,
      command_status: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      engage_ap: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type,
      guidance_valid: equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Readiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T) |
        (T))))
  }
}
