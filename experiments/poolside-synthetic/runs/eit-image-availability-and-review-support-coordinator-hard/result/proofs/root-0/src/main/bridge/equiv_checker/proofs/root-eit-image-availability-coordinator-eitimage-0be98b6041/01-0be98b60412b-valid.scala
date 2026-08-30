// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0be98b60412b_1_Valid {
  @pure def check(
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      presentationframe: equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame,
      reviewframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
