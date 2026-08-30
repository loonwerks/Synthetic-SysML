// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b7fa58c9e5fb_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue.D_Inv_RecoveryGateValue(value))) & T))
  }
}
