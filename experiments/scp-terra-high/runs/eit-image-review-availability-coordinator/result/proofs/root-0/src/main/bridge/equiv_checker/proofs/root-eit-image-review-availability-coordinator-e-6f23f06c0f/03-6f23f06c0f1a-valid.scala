// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6f23f06c0f1a_3_Valid {
  @pure def check(
      batchassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchAssessment,
      doctorrequest: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.DoctorRequest.Type,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      generatorproposal: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord,
      reviewprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewState.Type,
      viewerassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment,
      workflowdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.WorkflowDecision): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
