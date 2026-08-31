// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner {

  def initialise(api: AwarenessConditionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_awarenessCondition(AwarenessCondition.ACTIVE_AWARENESS_LOSS)
  }

  def timeTriggered(api: AwarenessConditionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_09_AWARENESS_CLEAR
        (api.motionContext != MotionContext.UNKNOWN &
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION) ___>: (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR),
        // case CASE_10_ACTIVE_OBSTACLE
        ((api.motionContext == MotionContext.TRANSLATING |
          api.motionContext == MotionContext.LANDING_CONTEXT) &
          api.obstacleAssessment == ObstacleAssessment.INDICATED) ___>: (api.awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT),
        // case CASE_11_STATIONARY_OBSTACLE
        (api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.INDICATED) ___>: (api.awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT),
        // case CASE_12_ACTIVE_AWARENESS_LOSS
        (api.motionContext == MotionContext.UNKNOWN |
          (api.motionContext == MotionContext.TRANSLATING |
            api.motionContext == MotionContext.LANDING_CONTEXT) &
            api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE) ___>: (api.awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS),
        // case CASE_13_STATIONARY_AWARENESS_UNAVAILABLE
        (api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE) ___>: (api.awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val motion: MotionContext.Type = api.get_motionContext() match {
      case Some(value) => value
      case _ => MotionContext.UNKNOWN
    }
    val obstacle: ObstacleAssessment.Type = api.get_obstacleAssessment() match {
      case Some(value) => value
      case _ => ObstacleAssessment.UNAVAILABLE
    }
    val condition: AwarenessCondition.Type =
      if (motion == MotionContext.UNKNOWN) AwarenessCondition.ACTIVE_AWARENESS_LOSS
      else if (obstacle == ObstacleAssessment.NO_INDICATION) AwarenessCondition.AWARENESS_CLEAR
      else if (obstacle == ObstacleAssessment.INDICATED &
               motion == MotionContext.STATIONARY) AwarenessCondition.STATIONARY_OBSTACLE_PRESENT
      else if (obstacle == ObstacleAssessment.INDICATED) AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT
      else if (motion == MotionContext.STATIONARY) AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE
      else AwarenessCondition.ACTIVE_AWARENESS_LOSS
    api.put_awarenessCondition(condition)
  }

  def finalise(api: AwarenessConditionOwner_Operational_Api): Unit = { }
}
