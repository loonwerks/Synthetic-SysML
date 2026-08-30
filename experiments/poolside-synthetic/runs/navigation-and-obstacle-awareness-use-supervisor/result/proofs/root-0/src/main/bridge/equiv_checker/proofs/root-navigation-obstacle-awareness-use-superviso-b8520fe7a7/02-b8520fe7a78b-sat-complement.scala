// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b8520fe7a78b_2_Complement {
  @pure def check(
      awarenesscondition: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type,
      motioncontext: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type,
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, awarenesscondition))) & T)))
  }
}
