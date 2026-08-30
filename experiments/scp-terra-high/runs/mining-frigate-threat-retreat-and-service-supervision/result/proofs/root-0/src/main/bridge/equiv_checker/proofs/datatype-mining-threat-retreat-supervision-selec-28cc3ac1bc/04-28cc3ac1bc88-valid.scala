// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_28cc3ac1bc88_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.SelectedCauseValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.SelectedCauseValue.D_Inv_SelectedCauseValue(value))) ___>: (T)) & T))
  }
}
