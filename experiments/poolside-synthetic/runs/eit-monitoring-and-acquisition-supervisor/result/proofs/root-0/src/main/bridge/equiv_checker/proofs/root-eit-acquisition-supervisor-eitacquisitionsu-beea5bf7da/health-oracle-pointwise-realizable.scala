// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_beea5bf7da7a_Oracle_Pointwise_Realizable {
  @pure def check(
      image_feedback: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFeedback.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_GumboX.compute_CEP_Post(image_feedback, equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_GumboX.compute_CEP_Post(image_feedback, equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_GumboX.compute_CEP_Post(image_feedback, equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.FAILED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_GumboX.compute_CEP_Post(image_feedback, equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT)))))
  }
}
