// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8b2fa9e4aa3f_3_Valid {
  @pure def check(
      status_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type,
      status_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
