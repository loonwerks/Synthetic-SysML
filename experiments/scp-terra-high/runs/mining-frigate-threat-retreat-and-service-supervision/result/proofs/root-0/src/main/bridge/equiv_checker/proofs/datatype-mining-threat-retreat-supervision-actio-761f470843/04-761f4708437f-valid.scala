// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_761f4708437f_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionValue.D_Inv_ActionValue(value))) ___>: (T)) & T))
  }
}
