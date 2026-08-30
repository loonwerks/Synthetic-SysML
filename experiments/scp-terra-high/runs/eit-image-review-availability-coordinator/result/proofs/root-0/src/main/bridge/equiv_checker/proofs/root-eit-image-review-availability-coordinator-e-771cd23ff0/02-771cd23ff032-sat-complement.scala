// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_771cd23ff032_2_Complement {
  @pure def check(
      viewerassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment,
      viewerobservation: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, viewerassessment))) & T)))
  }
}
