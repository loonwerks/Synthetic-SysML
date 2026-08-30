// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dd6987df8250_4_Valid {
  @pure def check(
      inertialassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type,
      inertialevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_GumboX.inititialize_IEP_Post(inertialevidence, inertialassessment))) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Candidate_GumboX.inititialize_IEP_Post(inertialevidence, inertialassessment))) & T))
  }
}
