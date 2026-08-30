// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a41df116d00b_1_Valid {
  @pure def check(
      atomic_result: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result,
      publication: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result): Unit = {
    Contract(Requires(T),
      Ensures((equiv_shared_0.Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_GumboX.compute_CEP_Pre(atomic_result)) ___>: (T)))
  }
}
