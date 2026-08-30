// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_49b9de7f805d_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_State_Input): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_State_Input.D_Inv_Phase_State_Input(value))) ___>: (T)) & T))
  }
}
