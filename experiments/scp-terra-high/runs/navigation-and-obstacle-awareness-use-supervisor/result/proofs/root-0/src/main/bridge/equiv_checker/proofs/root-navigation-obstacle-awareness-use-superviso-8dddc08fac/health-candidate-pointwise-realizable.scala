// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_8dddc08facf4_Candidate_Pointwise_Realizable {
  @pure def check(
      inertialevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(inertialevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(inertialevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(inertialevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)))))
  }
}
