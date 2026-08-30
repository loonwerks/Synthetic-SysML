// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_83bdf063d959_2_Complement {
  @pure def check(
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type,
      obstacleevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_GumboX.compute_CEP_Post(obstacleevidence, obstacleassessment))) & T)))
  }
}
