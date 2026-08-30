// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_04d7c857e12a_2_Complement {
  @pure def check(
      assessment_to_arbiter: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      assessment_to_compatibility: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      lifecycle_sample: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_GumboX.inititialize_IEP_Post(assessment_to_arbiter, assessment_to_compatibility))) & T)))
  }
}
