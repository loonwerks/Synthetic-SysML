// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ee0272304072_1_Valid {
  @pure def check(
      retreatcondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.Type,
      retreatnavigationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
