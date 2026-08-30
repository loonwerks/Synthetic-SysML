// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_667d2092ee0c_1_Valid {
  @pure def check(
      image_feedback: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFeedback.Type,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
