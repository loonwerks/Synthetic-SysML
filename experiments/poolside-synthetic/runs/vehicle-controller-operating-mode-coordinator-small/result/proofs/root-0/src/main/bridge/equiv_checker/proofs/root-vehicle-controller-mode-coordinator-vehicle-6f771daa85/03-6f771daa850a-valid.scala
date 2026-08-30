// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6f771daa850a_3_Valid {
  @pure def check(
      assessment_to_arbiter: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      assessment_to_compatibility: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      condition_sample: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
