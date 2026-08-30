// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_83d874741cf7_2_Complement {
  @pure def check(
      admissionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionFrame,
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      decisionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.DecisionFrame,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      presentationframe: equiv_shared_0.EIT_Image_Availability_Coordinator.PresentationFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      reviewframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ReviewFrame): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_GumboX.inititialize_IEP_Post(decisionframe))) & T)))
  }
}
