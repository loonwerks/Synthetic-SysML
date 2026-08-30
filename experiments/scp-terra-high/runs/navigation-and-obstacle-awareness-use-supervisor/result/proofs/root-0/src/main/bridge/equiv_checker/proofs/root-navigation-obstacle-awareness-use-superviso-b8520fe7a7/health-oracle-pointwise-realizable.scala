// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_b8520fe7a78b_Oracle_Pointwise_Realizable {
  @pure def check(
      motioncontext: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type,
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.compute_CEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)))))
  }
}
