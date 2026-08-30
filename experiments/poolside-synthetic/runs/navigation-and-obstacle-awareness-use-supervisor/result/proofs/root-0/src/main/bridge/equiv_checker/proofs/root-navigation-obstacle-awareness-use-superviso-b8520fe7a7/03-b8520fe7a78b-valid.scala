// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b8520fe7a78b_3_Valid {
  @pure def check(
      awarenesscondition: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type,
      motioncontext: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type,
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
