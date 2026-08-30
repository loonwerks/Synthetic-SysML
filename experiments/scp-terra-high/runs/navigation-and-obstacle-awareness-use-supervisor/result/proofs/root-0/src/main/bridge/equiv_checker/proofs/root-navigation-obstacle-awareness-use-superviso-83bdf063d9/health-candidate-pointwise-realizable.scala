// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_83bdf063d959_Candidate_Pointwise_Realizable {
  @pure def check(
      obstacleevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(obstacleevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(obstacleevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.INDICATED)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(obstacleevidence, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.UNAVAILABLE)))))
  }
}
