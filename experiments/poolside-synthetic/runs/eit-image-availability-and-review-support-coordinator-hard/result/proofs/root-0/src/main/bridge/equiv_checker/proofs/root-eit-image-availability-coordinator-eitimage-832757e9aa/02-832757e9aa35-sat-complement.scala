// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_832757e9aa35_2_Complement {
  @pure def check(
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      imagesignal: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageSignal.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_GumboX.compute_CEP_Post(imagesignal, imagefacts))) & T)))
  }
}
