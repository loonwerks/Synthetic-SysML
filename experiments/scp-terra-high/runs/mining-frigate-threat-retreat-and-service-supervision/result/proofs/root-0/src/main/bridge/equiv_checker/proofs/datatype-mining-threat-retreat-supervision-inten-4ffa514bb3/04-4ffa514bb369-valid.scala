// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ffa514bb369_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue.D_Inv_IntentValue(value))) ___>: (T)) & T))
  }
}
