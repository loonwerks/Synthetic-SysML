// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_53e6c44912f4_4_Valid {
  @pure def check(
      analysisavailability: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityFrame,
      decisionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.DecisionFrame,
      upstreamdisposition: equiv_shared_0.EIT_Image_Availability_Coordinator.UpstreamDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_GumboX.compute_CEP_Post(decisionframe, analysisavailability, upstreamdisposition))) ___>: (T)) & T))
  }
}
