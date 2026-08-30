// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_34e39e33be04_4_Valid {
  @pure def check(
      reviewdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot,
      reviewprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type,
      workflowdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowDecision,
      committedreviewstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_GumboX.inititialize_IEP_Post(committedreviewstate, reviewdecision, reviewprestate))) ___>: (T)) & T))
  }
}
