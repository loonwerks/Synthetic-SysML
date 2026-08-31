// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner {

  def initialise(api: AwarenessConditionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR)
  }

  def timeTriggered(api: AwarenessConditionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_09_AWARENESS_CLEAR
        (api.obstacleAssessment == ObstacleAssessment.NO_INDICATION) ___>: (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR),
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
    val motion = api.get_motionContext()
    val obstacle = api.get_obstacleAssessment()
    if (obstacle == Some(ObstacleAssessment.NO_INDICATION)) {
      api.put_awarenessCondition(AwarenessCondition.AWARENESS_CLEAR)
    } else if (motion == Some(MotionContext.UNKNOWN) |
      ((motion == Some(MotionContext.TRANSLATING) | motion == Some(MotionContext.LANDING_CONTEXT)) &
        obstacle == Some(ObstacleAssessment.UNAVAILABLE))) {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_AWARENESS_LOSS)
    } else if ((motion == Some(MotionContext.TRANSLATING) | motion == Some(MotionContext.LANDING_CONTEXT)) &
      obstacle == Some(ObstacleAssessment.INDICATED)) {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT)
    } else if (motion == Some(MotionContext.STATIONARY) & obstacle == Some(ObstacleAssessment.INDICATED)) {
      api.put_awarenessCondition(AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)
    } else if (motion == Some(MotionContext.STATIONARY) & obstacle == Some(ObstacleAssessment.UNAVAILABLE)) {
      api.put_awarenessCondition(AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)
    } else {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_AWARENESS_LOSS)
    }
  }

  def finalise(api: AwarenessConditionOwner_Operational_Api): Unit = { }
}
