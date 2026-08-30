// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af7ede133e61_3_Valid {
  @pure def check(
      feedbackassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.FeedbackAssessment,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      generatorproposal: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord,
      recoveryrequest: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
