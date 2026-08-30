// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_beea5bf7da7a_2_Complement {
  @pure def check(
      image_feedback: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFeedback.Type,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_GumboX.compute_CEP_Post(image_feedback, image_result_facts))) & T)))
  }
}
