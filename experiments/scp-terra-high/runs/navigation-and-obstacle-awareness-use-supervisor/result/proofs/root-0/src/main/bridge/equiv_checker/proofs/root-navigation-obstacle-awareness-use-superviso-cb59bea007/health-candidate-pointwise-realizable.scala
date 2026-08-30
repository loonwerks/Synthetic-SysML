// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cb59bea00723_Candidate_Pointwise_Realizable {
  @pure def check(
      motioncontext: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type,
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Candidate_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Candidate_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Candidate_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Candidate_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Candidate_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)))))
  }
}
