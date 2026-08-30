// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_caaef5b97c87_2_Complement {
  @pure def check(
      artifactframe: equiv_shared_0.EIT_Image_Availability_Coordinator.ArtifactFrame,
      availabilityframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_GumboX.compute_CEP_Post(artifactframe, evidenceframe, recoveryframe, servicefacts, availabilityframe))) & T)))
  }
}
