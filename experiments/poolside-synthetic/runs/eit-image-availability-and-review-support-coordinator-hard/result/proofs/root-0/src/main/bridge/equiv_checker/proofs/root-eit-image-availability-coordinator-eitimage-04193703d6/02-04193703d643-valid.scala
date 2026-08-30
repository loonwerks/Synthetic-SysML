// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_04193703d643_2_Valid {
  @pure def check(
      admissionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionFrame,
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFacts.Type,
      in_artifact: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactState.Type,
      artifact: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_GumboX.compute_CEP_Post(in_artifact, artifact, admissionframe, imagefacts, recoveryframe, reviewfacts, artifactframe))) & T))
  }
}
