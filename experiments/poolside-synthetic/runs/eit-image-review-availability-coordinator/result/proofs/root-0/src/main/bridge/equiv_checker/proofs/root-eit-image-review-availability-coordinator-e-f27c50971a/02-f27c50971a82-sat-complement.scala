// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f27c50971a82_2_Complement {
  @pure def check(
      batchassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchAssessment,
      batchevent: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchEvent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.BatchQualificationOwner_imageReviewCoordinationProcess_batchQualificationOwner_GumboX.compute_CEP_Post(batchevent, batchassessment))) & T)))
  }
}
