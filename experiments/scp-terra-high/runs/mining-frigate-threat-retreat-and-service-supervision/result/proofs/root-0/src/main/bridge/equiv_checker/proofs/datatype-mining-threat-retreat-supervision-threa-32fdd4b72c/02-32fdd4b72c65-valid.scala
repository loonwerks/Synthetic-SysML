// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_32fdd4b72c65_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue.D_Inv_ThreatValidityValue(value))) & T))
  }
}
