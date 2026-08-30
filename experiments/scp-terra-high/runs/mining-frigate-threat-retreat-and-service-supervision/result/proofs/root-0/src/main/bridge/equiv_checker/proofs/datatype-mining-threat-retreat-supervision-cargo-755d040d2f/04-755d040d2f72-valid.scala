// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_755d040d2f72_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.CargoBandValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.CargoBandValue.D_Inv_CargoBandValue(value))) ___>: (T)) & T))
  }
}
