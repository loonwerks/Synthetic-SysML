// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af4ba4a17992_2_Complement {
  @pure def check(
      qualified_intent: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Intent.Type,
      review_intent_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Review_Intent_Sample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification_GumboX.inititialize_IEP_Post(qualified_intent))) & T)))
  }
}
