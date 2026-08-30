// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f013a87323a9_Candidate_Pointwise_Realizable {
  @pure def check(
      conditionevidence: equiv_shared_0.Vehicle_Mode_Coordinator.ConditionEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Candidate_GumboX.compute_CEP_Post(conditionevidence, equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.CurrentNormal)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Candidate_GumboX.compute_CEP_Post(conditionevidence, equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.CurrentDegraded)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Candidate_GumboX.compute_CEP_Post(conditionevidence, equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.Unusable)))))
  }
}
