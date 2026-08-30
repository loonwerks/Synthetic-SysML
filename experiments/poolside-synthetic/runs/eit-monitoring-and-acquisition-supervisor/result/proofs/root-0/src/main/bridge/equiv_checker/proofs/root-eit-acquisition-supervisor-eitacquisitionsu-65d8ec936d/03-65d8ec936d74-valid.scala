// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_65d8ec936d74_3_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      batch_signal: equiv_shared_0.EIT_Acquisition_Supervisor.BatchSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
