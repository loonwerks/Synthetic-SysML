// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_82e7ac8d6c93_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue.D_Inv_RecoveryStateValue(value))) ___>: (T)) & T))
  }
}
