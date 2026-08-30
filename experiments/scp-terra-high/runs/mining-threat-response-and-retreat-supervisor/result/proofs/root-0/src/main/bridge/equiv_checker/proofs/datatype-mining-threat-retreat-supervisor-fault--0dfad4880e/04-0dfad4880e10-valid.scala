// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0dfad4880e10_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Fact): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Fault_Fact.D_Inv_Fault_Fact(value))) ___>: (T)) & T))
  }
}
