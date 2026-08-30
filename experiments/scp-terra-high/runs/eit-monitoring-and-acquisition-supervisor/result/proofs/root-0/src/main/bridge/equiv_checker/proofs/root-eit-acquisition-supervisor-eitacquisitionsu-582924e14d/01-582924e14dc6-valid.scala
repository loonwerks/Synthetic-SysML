// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_582924e14dc6_1_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      imagememory: equiv_shared_0.EIT_Acquisition_Supervisor.ImageState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
