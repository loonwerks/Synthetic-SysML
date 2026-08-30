// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_04193703d643_1_Valid {
  @pure def check(
      admissionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionFrame,
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      in_artifact: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactState.Type,
      artifact: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
