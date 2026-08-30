// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_832757e9aa35_1_Valid {
  @pure def check(
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      imagesignal: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
