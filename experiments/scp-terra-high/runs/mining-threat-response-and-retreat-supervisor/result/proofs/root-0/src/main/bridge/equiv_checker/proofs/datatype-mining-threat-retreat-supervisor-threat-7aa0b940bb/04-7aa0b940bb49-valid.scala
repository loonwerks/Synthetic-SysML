// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7aa0b940bb49_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_State_Input): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_State_Input.D_Inv_Threat_State_Input(value))) ___>: (T)) & T))
  }
}
