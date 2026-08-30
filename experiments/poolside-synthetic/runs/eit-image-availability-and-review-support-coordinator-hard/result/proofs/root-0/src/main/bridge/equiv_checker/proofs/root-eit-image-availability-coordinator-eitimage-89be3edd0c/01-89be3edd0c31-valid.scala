// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_89be3edd0c31_1_Valid {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      evidence: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
