// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_42d348d23d9b_3_Valid {
  @pure def check(
      ap_availability_in: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type,
      ap_availability_out: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
