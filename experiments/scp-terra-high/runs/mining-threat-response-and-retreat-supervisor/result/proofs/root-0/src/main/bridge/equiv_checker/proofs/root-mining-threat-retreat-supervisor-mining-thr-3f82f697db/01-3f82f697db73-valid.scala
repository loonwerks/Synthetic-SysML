// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3f82f697db73_1_Valid {
  @pure def check(
      atomic_result: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result,
      publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
