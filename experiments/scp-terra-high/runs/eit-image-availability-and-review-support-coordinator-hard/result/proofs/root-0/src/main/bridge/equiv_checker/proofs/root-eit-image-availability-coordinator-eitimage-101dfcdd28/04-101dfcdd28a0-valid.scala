// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_101dfcdd28a0_4_Valid {
  @pure def check(
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      imagesignal: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_GumboX.inititialize_IEP_Post(imagefacts))) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_Candidate_GumboX.inititialize_IEP_Post(imagefacts))) & T))
  }
}
