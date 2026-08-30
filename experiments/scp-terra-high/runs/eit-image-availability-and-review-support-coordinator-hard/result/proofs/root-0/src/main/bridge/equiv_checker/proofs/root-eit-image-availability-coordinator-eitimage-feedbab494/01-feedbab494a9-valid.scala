// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_feedbab494a9_1_Valid {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      faultsummary: equiv_shared_0.EIT_Image_Availability_Coordinator.FaultSummary,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
