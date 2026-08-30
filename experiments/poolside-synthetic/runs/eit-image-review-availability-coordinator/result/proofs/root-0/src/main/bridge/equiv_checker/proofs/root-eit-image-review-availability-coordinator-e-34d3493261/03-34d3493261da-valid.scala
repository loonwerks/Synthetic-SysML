// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_34d3493261da_3_Valid {
  @pure def check(
      generationcommand: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationCommand.Type,
      generationdecision: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.GenerationDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
