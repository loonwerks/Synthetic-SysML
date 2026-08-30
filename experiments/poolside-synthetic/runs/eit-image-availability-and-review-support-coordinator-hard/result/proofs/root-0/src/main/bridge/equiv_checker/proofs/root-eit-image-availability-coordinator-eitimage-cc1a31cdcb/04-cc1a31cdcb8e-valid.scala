// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cc1a31cdcb8e_4_Valid {
  @pure def check(
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      reviewframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFrame,
      review: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_GumboX.inititialize_IEP_Post(review, reviewframe))) ___>: (T)) & T))
  }
}
