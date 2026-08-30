// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1d9d3b2fa0a8_3_Valid {
  @pure def check(
      assessment_to_arbiter: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      assessment_to_compatibility: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      lifecycle_sample: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
