// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bb826aa4e321_2_Complement {
  @pure def check(
      feedbackassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.FeedbackAssessment,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      generatorproposal: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorProposalRecord,
      recoveryrequest: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.RecoveryRequest.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorOutcomeRecoveryOwner_imageReviewCoordinationProcess_generatorOutcomeRecoveryOwner_GumboX.compute_CEP_Post(feedbackassessment, generationprestate, recoveryrequest, generatorproposal))) & T)))
  }
}
