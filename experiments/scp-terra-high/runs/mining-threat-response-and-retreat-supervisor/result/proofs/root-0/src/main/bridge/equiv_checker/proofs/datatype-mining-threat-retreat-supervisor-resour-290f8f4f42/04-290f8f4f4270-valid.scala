// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_290f8f4f4270_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts.D_Inv_Resource_Publication_Facts(value))) ___>: (T)) & T))
  }
}
