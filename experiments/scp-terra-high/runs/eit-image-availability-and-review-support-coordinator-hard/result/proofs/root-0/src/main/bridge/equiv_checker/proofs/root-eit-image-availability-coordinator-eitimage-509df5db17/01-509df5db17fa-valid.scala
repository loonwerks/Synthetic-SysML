// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_509df5db17fa_1_Valid {
  @pure def check(
      availabilityservice: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceObservation.Type,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
