// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5213340e9686_2_Complement {
  @pure def check(
      assessment_context: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentContext.Type,
      decision_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_Candidate_GumboX.compute_CEP_Post(assessment_context, qualified_evidence, decision_assessment))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_GumboX.compute_CEP_Post(assessment_context, qualified_evidence, decision_assessment))) & T)))
  }
}
