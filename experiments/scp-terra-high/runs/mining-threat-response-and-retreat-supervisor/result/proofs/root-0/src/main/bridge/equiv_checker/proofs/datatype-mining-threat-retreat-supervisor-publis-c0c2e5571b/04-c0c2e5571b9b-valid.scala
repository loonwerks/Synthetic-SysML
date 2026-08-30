// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c0c2e5571b9b_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result.D_Inv_Published_Supervisor_Result(value))) ___>: (T)) & T))
  }
}
