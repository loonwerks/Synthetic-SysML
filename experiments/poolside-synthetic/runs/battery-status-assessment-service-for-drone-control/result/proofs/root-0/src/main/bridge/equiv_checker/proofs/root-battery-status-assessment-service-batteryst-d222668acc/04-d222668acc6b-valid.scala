// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d222668acc6b_4_Valid {
  @pure def check(
      acquisition_directive: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionDirective.Type,
      acquisition_outcome: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionOutcome.Type,
      assessment_context: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentContext.Type,
      check_request: equiv_shared_0.Battery_Status_Assessment_Service.CheckRequest,
      check_status: equiv_shared_0.Battery_Status_Assessment_Service.CheckStatus.Type,
      publication_directive: equiv_shared_0.Battery_Status_Assessment_Service.PublicationDirective.Type,
      publication_outcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      in_lastadmittedtoken: equiv_shared_0.Battery_Status_Assessment_Service.LastAdmittedToken.Type,
      lastadmittedtoken: equiv_shared_0.Battery_Status_Assessment_Service.LastAdmittedToken.Type,
      in_lifecyclestate: equiv_shared_0.Battery_Status_Assessment_Service.LifecycleState.Type,
      lifecyclestate: equiv_shared_0.Battery_Status_Assessment_Service.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_GumboX.compute_CEP_Post(in_lastadmittedtoken, in_lifecyclestate, lastadmittedtoken, lifecyclestate, acquisition_outcome, check_request, publication_outcome, acquisition_directive, assessment_context, check_status, publication_directive))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_Candidate_GumboX.compute_CEP_Post(in_lastadmittedtoken, in_lifecyclestate, lastadmittedtoken, lifecyclestate, acquisition_outcome, check_request, publication_outcome, acquisition_directive, assessment_context, check_status, publication_directive))) & T))
  }
}
