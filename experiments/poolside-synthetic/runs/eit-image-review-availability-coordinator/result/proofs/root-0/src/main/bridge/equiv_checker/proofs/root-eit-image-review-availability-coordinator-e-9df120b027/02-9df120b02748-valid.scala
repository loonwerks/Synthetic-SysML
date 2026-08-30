// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9df120b02748_2_Valid {
  @pure def check(
      reviewdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewDecisionSnapshot,
      reviewprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type,
      workflowdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowDecision,
      in_committedreviewstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type,
      committedreviewstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewSessionStateGovernor_imageReviewCoordinationProcess_reviewSessionStateGovernor_GumboX.compute_CEP_Post(in_committedreviewstate, committedreviewstate, workflowdecision, reviewdecision, reviewprestate))) & T))
  }
}
