// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_caaef5b97c87_1_Valid {
  @pure def check(
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
