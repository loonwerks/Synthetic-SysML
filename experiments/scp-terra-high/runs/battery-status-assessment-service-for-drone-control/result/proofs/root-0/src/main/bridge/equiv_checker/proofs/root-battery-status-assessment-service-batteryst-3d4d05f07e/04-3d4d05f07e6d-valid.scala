// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3d4d05f07e6d_4_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      control_use_feedback: equiv_shared_0.Battery_Status_Assessment_Service.ControlUseFeedback,
      decision_assessment: equiv_shared_0.Battery_Status_Assessment_Service.TaggedAssessment,
      publication_directive: equiv_shared_0.Battery_Status_Assessment_Service.PublicationDirective.Type,
      publication_outcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      in_committedpublicationoutcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      committedpublicationoutcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      in_publicationstate: equiv_shared_0.Battery_Status_Assessment_Service.PublicationState.Type,
      publicationstate: equiv_shared_0.Battery_Status_Assessment_Service.PublicationState.Type,
      in_retainedassessment: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentResult.Type,
      retainedassessment: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentResult.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_GumboX.compute_CEP_Post(in_committedpublicationoutcome, in_publicationstate, in_retainedassessment, committedpublicationoutcome, publicationstate, retainedassessment, control_use_feedback, decision_assessment, publication_directive, battery_assessment, publication_outcome))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_Candidate_GumboX.compute_CEP_Post(in_committedpublicationoutcome, in_publicationstate, in_retainedassessment, committedpublicationoutcome, publicationstate, retainedassessment, control_use_feedback, decision_assessment, publication_directive, battery_assessment, publication_outcome))) & T))
  }
}
