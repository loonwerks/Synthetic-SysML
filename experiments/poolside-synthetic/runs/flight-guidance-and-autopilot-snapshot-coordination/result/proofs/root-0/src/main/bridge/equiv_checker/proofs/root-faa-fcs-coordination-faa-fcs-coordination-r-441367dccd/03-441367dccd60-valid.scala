// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_441367dccd60_3_Valid {
  @pure def check(
      reference_state_in: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type,
      reference_state_out: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
