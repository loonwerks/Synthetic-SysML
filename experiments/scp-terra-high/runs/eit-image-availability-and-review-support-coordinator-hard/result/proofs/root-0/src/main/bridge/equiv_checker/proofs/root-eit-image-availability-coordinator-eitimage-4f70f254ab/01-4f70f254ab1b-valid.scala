// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4f70f254ab1b_1_Valid {
  @pure def check(
      analysisavailability: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityFrame,
      decisionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.DecisionFrame,
      upstreamdisposition: equiv_shared_0.EIT_Image_Availability_Coordinator.UpstreamDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
