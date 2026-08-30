// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ea9d33073ef1_3_Valid {
  @pure def check(
      viewerassessment: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerAssessment,
      viewerobservation: equiv_shared_0.EIT_Image_Review_Availability_Coordinator.ViewerObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
