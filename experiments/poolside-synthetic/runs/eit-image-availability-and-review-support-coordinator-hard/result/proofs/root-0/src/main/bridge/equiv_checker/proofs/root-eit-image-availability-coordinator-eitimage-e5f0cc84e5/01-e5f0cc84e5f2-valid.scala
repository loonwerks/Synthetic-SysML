// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e5f0cc84e5f2_1_Valid {
  @pure def check(
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      reviewframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFrame,
      in_review: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewState.Type,
      review: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
