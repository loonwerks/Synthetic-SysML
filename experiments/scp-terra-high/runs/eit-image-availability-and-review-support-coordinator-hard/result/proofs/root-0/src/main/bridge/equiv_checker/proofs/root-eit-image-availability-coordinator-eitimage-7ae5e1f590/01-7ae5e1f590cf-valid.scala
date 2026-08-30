// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7ae5e1f590cf_1_Valid {
  @pure def check(
      doctorsignal: equiv_shared_0.EIT_Image_Availability_Coordinator.DoctorSignal.Type,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
