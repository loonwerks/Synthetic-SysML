// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_771cd23ff032_Oracle_Pointwise_Realizable {
  @pure def check(
      viewerobservation: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition = equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_UNAVAILABLE, accessible = F))) |
        (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition = equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_UNAVAILABLE, accessible = T))) |
        (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition = equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_AVAILABLE, accessible = F))) |
        (equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ReviewAccessQualificationOwner_imageReviewCoordinationProcess_reviewAccessQualificationOwner_GumboX.compute_CEP_Post(viewerobservation, equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment(condition = equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerCondition.REVIEW_ACCESS_AVAILABLE, accessible = T))))))
  }
}
