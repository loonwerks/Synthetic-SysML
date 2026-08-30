// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0fa1a85eaf79_2_Valid {
  @pure def check(
      qualified_intent: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Intent.Type,
      review_intent_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Review_Intent_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_GumboX.compute_CEP_Post(review_intent_sample, qualified_intent))) & T))
  }
}
