// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ba35fca8755c_2_Complement {
  @pure def check(
      admissionframe: equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionFrame,
      contextfacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ContextFacts.Type,
      evidenceframe: equiv_shared_0.EIT_Image_Availability_Coordinator.EvidenceFrame,
      imagefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ImageFacts.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      servicefacts: equiv_shared_0.EIT_Image_Availability_Coordinator.ServiceFacts.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_GumboX.compute_CEP_Post(contextfacts, evidenceframe, imagefacts, recoveryframe, servicefacts, admissionframe))) & T)))
  }
}
