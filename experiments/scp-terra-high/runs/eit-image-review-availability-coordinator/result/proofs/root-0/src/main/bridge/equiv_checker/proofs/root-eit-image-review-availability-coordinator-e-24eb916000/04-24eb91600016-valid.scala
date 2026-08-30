// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_24eb91600016_4_Valid {
  @pure def check(
      generationdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot,
      reviewavailability: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type,
      reviewdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot,
      workflowstatus: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_GumboX.compute_CEP_Post(generationdecision, reviewdecision, reviewavailability, workflowstatus))) ___>: (T)) & T))
  }
}
