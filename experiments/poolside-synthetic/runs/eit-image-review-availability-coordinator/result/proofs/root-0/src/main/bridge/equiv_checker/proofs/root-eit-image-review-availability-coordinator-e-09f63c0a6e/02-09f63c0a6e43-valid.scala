// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_09f63c0a6e43_2_Valid {
  @pure def check(
      batchassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchAssessment,
      batchevent: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchEvent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_GumboX.inititialize_IEP_Post(batchassessment))) & T))
  }
}
