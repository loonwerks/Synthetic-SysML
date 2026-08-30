// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0a52cb59fab1_Candidate_Pointwise_Realizable {
  @pure def check(
      barometricevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(barometricevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(barometricevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(barometricevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)))))
  }
}
