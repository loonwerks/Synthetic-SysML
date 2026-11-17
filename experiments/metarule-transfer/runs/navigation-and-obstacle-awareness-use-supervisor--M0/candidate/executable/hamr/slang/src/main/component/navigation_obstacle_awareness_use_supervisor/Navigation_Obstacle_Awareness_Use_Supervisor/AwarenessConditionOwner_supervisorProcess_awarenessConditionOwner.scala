// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner {

  def initialise(api: AwarenessConditionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS)
  }

  def timeTriggered(api: AwarenessConditionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_09_AWARENESS_CLEAR
        //   Known context with no indication is clear
        (api.motionContext != MotionContext.UNKNOWN &
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION) ___>: (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR),
        // case CASE_10_ACTIVE_OBSTACLE
        //   Obstacle indication conflicts with active motion
        ((api.motionContext == MotionContext.TRANSLATING |
          api.motionContext == MotionContext.LANDING_CONTEXT) &
          api.obstacleAssessment == ObstacleAssessment.INDICATED) ___>: (api.awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT),
        // case CASE_11_STATIONARY_OBSTACLE
        //   Stationary obstacle indication is retained
        (api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.INDICATED) ___>: (api.awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT),
        // case CASE_12_ACTIVE_AWARENESS_LOSS
        //   Unknown or active unavailable awareness holds
        (api.motionContext == MotionContext.UNKNOWN |
          (api.motionContext == MotionContext.TRANSLATING |
            api.motionContext == MotionContext.LANDING_CONTEXT) &
            api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE) ___>: (api.awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS),
        // case CASE_13_STATIONARY_AWARENESS_UNAVAILABLE
        //   Stationary unavailable awareness is reported
        (api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE) ___>: (api.awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_motionContext() match {
      case Some(context) =>
        api.get_obstacleAssessment() match {
          case Some(obstacle) =>
            val condition: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type =
              if (context == Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.UNKNOWN) {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS
              } else if (obstacle == Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION) {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR
              } else if (obstacle == Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.INDICATED &
                (context == Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.TRANSLATING |
                  context == Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.LANDING_CONTEXT)) {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT
              } else if (obstacle == Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.INDICATED) {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_OBSTACLE_PRESENT
              } else if (context == Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.STATIONARY) {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE
              } else {
                Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS
              }
            api.put_awarenessCondition(condition)
          case _ =>
            api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS)
        }
      case _ =>
        api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS)
    }
  }

  def finalise(api: AwarenessConditionOwner_Operational_Api): Unit = { }
}
