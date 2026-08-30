// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e1f7b88f49b_3_Valid {
  @pure def check(
      ap_on_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_On_Indication.Type,
      ap_on_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_On_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
