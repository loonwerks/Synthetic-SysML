// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_832757e9aa35_Candidate_Pointwise_Realizable {
  @pure def check(
      imagesignal: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.compute_CEP_Post(imagesignal, equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.compute_CEP_Post(imagesignal, equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.NEW_IMAGE)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.compute_CEP_Post(imagesignal, equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.WITHDRAWAL)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.compute_CEP_Post(imagesignal, equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.REPORTED_FAILURE)) |
        (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.compute_CEP_Post(imagesignal, equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.INVALID)))))
  }
}
