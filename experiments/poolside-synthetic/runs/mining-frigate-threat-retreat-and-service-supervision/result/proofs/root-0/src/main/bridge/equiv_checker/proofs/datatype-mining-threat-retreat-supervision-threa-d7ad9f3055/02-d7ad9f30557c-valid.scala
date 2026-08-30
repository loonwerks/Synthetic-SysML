// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d7ad9f30557c_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue.D_Inv_ThreatDispositionValue(value))) & T))
  }
}
