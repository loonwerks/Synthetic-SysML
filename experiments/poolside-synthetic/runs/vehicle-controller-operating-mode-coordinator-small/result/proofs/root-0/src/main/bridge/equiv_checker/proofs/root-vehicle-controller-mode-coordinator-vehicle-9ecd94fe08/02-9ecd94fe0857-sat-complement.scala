// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9ecd94fe0857_2_Complement {
  @pure def check(
      assessment_to_arbiter: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      assessment_to_compatibility: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      condition_sample: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_GumboX.inititialize_IEP_Post(assessment_to_arbiter, assessment_to_compatibility))) & T)))
  }
}
