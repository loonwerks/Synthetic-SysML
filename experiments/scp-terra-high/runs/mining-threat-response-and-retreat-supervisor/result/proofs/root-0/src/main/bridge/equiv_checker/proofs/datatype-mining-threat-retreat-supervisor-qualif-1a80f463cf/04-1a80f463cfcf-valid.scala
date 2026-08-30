// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1a80f463cfcf_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Qualified_Threat.D_Inv_Qualified_Threat(value))) ___>: (T)) & T))
  }
}
