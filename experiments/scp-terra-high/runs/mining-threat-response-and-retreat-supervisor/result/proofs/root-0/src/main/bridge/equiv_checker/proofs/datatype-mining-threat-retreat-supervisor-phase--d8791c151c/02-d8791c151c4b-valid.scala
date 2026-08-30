// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d8791c151c4b_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Phase_Context.D_Inv_Phase_Context(value))) & T))
  }
}
