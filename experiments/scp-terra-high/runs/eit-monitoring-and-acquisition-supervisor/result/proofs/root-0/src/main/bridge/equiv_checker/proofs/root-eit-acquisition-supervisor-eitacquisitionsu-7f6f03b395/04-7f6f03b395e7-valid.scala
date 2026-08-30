// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f6f03b395e7_4_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      batch_signal: equiv_shared_0.EIT_Acquisition_Supervisor.BatchSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_GumboX.compute_CEP_Post(batch_signal, batch_facts))) ___>: (T)) & T))
  }
}
