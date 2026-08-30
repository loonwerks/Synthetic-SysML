// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1d9d3b2fa0a8_2_Valid {
  @pure def check(
      assessment_to_arbiter: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      assessment_to_compatibility: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      lifecycle_sample: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_GumboX.compute_CEP_Post(lifecycle_sample, assessment_to_arbiter, assessment_to_compatibility))) & T))
  }
}
