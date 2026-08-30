// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3614e627a44_4_Valid {
  @pure def check(
      generationdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      workflowdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowDecision,
      committedgenerationstate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationSlotStateGovernor_imageReviewCoordinationProcess_generationSlotStateGovernor_GumboX.inititialize_IEP_Post(committedgenerationstate, generationdecision, generationprestate))) ___>: (T)) & T))
  }
}
