// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c31c65375b92_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatSampleValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatSampleValue.D_Inv_ThreatSampleValue(value))) ___>: (T)) & T))
  }
}
