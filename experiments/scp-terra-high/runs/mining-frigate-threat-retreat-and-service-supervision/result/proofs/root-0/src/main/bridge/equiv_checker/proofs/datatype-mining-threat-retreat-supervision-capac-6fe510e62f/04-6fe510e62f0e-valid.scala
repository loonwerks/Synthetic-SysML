// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6fe510e62f0e_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.CapacitorBandValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.CapacitorBandValue.D_Inv_CapacitorBandValue(value))) ___>: (T)) & T))
  }
}
