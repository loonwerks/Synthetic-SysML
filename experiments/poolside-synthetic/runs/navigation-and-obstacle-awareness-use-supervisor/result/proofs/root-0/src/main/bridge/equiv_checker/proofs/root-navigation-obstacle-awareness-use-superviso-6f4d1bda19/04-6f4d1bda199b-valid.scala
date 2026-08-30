// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6f4d1bda199b_4_Valid {
  @pure def check(
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type,
      obstacleevidence: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_GumboX.inititialize_IEP_Post(obstacleevidence, obstacleassessment))) ___>: (T)) & T))
  }
}
