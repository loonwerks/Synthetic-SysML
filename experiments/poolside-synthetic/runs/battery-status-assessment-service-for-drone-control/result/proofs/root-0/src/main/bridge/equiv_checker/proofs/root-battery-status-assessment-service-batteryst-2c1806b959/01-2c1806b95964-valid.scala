// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2c1806b95964_1_Valid {
  @pure def check(
      assessment_context: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentContext.Type,
      decision_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      qualified_evidence: equiv_shared_0.Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
