// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b9802798719_2_Complement {
  @pure def check(
      availability_status: equiv_shared_0.EIT_Image_Availability_Coordinator.Availability_Status.Type,
      image_delivery: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Delivery.Type,
      image_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Doctor_Publication_image_availability_process_doctor_publication_GumboX.compute_CEP_Post(image_resolution, availability_status, image_delivery))) & T)))
  }
}
