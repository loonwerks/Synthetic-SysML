// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b009a51ed7b1_2_Complement {
  @pure def check(
      generationdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot,
      reviewavailability: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAvailability.Type,
      reviewdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot,
      workflowstatus: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowStatus): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.AvailabilityPublicationPolicy_imageReviewCoordinationProcess_availabilityPublicationPolicy_GumboX.inititialize_IEP_Post(reviewavailability, workflowstatus))) & T)))
  }
}
