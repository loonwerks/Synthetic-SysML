// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_771cd23ff032_4_Valid {
  @pure def check(
      viewerassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment,
      viewerobservation: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, viewerassessment))) ___>: (T)) & T))
  }
}
