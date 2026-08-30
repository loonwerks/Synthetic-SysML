// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_caff34ec0b48_1_Valid {
  @pure def check(
      request_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type,
      request_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
