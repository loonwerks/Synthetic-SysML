// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f27c50971a82_4_Valid {
  @pure def check(
      batchassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchAssessment,
      batchevent: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchEvent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_GumboX.compute_CEP_Post(batchevent, batchassessment))) ___>: (T)) & T))
  }
}
