// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2c74b9e2ac5f_3_Valid {
  @pure def check(
      command_status_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      command_status_out: equiv_shared_0.FAA_Autopilot_Engagement.Engage_Command_Status.Type,
      engage_ap_in: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type,
      engage_ap_out: equiv_shared_0.FAA_Autopilot_Engagement.Engage_AP_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
