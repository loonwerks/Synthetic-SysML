// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_12d900af6b62_2_Valid {
  @pure def check(
      generationdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      workflowdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowDecision,
      in_committedgenerationstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      committedgenerationstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_GumboX.compute_CEP_Post(in_committedgenerationstate, committedgenerationstate, workflowdecision, generationdecision, generationprestate))) & T))
  }
}
