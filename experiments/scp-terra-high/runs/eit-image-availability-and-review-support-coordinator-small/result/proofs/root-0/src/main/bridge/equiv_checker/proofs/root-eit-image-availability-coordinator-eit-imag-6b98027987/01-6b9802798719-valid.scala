// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b9802798719_1_Valid {
  @pure def check(
      availability_status: equiv_shared_0.EIT_Image_Availability_Coordinator.Availability_Status.Type,
      image_delivery: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Delivery.Type,
      image_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
