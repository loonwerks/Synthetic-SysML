// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_84e19a8c0fe8_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts.D_Inv_Threat_Publication_Facts(value))) ___>: (T)) & T))
  }
}
