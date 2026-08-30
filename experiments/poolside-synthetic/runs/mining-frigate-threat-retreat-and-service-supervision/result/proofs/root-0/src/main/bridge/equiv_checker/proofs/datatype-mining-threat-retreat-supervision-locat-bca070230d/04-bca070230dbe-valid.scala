// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bca070230dbe_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.LocationValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.LocationValue.D_Inv_LocationValue(value))) ___>: (T)) & T))
  }
}
