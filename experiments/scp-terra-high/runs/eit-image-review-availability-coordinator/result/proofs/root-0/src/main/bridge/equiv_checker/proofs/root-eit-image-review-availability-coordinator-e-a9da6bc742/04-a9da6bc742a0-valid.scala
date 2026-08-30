// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a9da6bc742a0_4_Valid {
  @pure def check(
      feedbackassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.FeedbackAssessment,
      generationprestate: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationState.Type,
      generatorfeedback: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorFeedback.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GeneratorFeedbackQualificationOwner_imageReviewCoordinationProcess_generatorFeedbackQualificationOwner_GumboX.compute_CEP_Post(generationprestate, generatorfeedback, feedbackassessment))) ___>: (T)) & T))
  }
}
