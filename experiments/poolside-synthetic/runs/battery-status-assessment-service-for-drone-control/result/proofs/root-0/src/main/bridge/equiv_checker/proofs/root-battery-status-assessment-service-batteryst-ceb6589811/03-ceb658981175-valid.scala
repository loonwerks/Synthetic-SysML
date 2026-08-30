// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ceb658981175_3_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      control_use_feedback: equiv_shared_0.Battery_Status_Assessment_Service.ControlUseFeedback,
      decision_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      publication_directive: equiv_shared_0.Battery_Status_Assessment_Service.PublicationDirective.Type,
      publication_outcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      committedpublicationoutcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      publicationstate: equiv_shared_0.Battery_Status_Assessment_Service.PublicationState.Type,
      retainedassessment: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentResult.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
