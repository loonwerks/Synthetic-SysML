// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af4ba4a17992_3_Valid {
  @pure def check(
      qualified_intent: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Intent.Type,
      review_intent_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Review_Intent_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
