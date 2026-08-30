// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_47b3b4179490_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.PublicResultValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.PublicResultValue.D_Inv_PublicResultValue(value))) & T))
  }
}
