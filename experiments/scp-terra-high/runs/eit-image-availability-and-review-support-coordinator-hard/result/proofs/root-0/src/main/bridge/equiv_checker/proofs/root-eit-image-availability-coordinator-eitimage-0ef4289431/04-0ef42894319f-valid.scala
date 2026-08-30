// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0ef42894319f_4_Valid {
  @pure def check(
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_GumboX.inititialize_IEP_Post(availabilityframe))) ___>: (T)) & T))
  }
}
