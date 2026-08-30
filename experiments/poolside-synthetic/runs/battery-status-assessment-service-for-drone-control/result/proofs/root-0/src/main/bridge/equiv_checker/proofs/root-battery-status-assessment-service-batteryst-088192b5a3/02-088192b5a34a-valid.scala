// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_088192b5a34a_2_Valid {
  @pure def check(
      acquisition_directive: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionDirective.Type,
      acquisition_outcome: equiv_shared_0.Battery_Status_Assessment_Service.AcquisitionOutcome.Type,
      assessment_context: equiv_shared_0.Battery_Status_Assessment_Service.AssessmentContext.Type,
      check_request: equiv_shared_0.Battery_Status_Assessment_Service.CheckRequest,
      check_status: equiv_shared_0.Battery_Status_Assessment_Service.CheckStatus.Type,
      publication_directive: equiv_shared_0.Battery_Status_Assessment_Service.PublicationDirective.Type,
      publication_outcome: equiv_shared_0.Battery_Status_Assessment_Service.PublicationOutcome.Type,
      lastadmittedtoken: equiv_shared_0.Battery_Status_Assessment_Service.LastAdmittedToken.Type,
      lifecyclestate: equiv_shared_0.Battery_Status_Assessment_Service.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_Candidate_GumboX.inititialize_IEP_Post(lastadmittedtoken, lifecyclestate, acquisition_directive, assessment_context, check_status, publication_directive))) ___>: (equiv_shared_0.Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_GumboX.inititialize_IEP_Post(lastadmittedtoken, lifecyclestate, acquisition_directive, assessment_context, check_status, publication_directive))) & T))
  }
}
