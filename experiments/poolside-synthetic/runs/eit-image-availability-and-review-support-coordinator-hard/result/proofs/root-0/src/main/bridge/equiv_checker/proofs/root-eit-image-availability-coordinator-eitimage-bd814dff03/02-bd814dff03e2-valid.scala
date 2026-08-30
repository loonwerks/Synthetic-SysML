// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bd814dff03e2_2_Valid {
  @pure def check(
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      in_evidence: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceState.Type,
      evidence: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_GumboX.compute_CEP_Post(in_evidence, evidence, contextfacts, imagefacts, recoveryframe, evidenceframe))) & T))
  }
}
