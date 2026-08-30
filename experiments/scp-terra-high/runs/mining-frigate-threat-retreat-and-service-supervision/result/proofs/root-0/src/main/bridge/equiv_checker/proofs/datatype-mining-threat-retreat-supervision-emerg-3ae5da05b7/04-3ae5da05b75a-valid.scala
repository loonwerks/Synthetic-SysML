// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3ae5da05b75a_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue.D_Inv_EmergencyStateValue(value))) ___>: (T)) & T))
  }
}
