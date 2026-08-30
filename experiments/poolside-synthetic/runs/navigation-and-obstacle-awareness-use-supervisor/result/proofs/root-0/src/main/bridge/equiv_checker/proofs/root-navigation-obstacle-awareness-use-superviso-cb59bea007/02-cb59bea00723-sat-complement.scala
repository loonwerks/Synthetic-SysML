// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cb59bea00723_2_Complement {
  @pure def check(
      awarenesscondition: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type,
      motioncontext: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type,
      obstacleassessment: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_GumboX.inititialize_IEP_Post(motioncontext, obstacleassessment, awarenesscondition))) & T)))
  }
}
