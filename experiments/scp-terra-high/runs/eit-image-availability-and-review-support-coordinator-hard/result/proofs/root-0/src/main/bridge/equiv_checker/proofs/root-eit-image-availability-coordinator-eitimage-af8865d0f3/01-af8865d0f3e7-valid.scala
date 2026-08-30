// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af8865d0f3e7_1_Valid {
  @pure def check(
      admissionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionFrame,
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      artifact: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
