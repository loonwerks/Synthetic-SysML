// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2c1806b95964_4_Valid {
  @pure def check(
      assessment_context: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentContext.Type,
      decision_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_GumboX.inititialize_IEP_Post(decision_assessment))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_Candidate_GumboX.inititialize_IEP_Post(decision_assessment))) & T))
  }
}
