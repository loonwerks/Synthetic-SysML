// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f013a87323a9_2_Valid {
  @pure def check(
      conditionassessment: equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.Type,
      conditionevidence: equiv_shared_0.Vehicle_Mode_Coordinator.ConditionEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Candidate_GumboX.compute_CEP_Post(conditionevidence, conditionassessment))) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_GumboX.compute_CEP_Post(conditionevidence, conditionassessment))) & T))
  }
}
