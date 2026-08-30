// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner {

  def initialise(api: AwarenessConditionOwner_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_AWARENESS_CONDITION_clear
        api.motionContext != MotionContext.UNKNOWN &
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION ___>:
          api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR,
        // guarantee INITIAL_AWARENESS_CONDITION_active_obstacle
        (api.motionContext == MotionContext.TRANSLATING |
           api.motionContext == MotionContext.LANDING_CONTEXT) &
          api.obstacleAssessment == ObstacleAssessment.INDICATED ___>:
          api.awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT,
        // guarantee INITIAL_AWARENESS_CONDITION_stationary_obstacle
        api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.INDICATED ___>:
          api.awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT,
        // guarantee INITIAL_AWARENESS_CONDITION_active_loss
        api.motionContext == MotionContext.UNKNOWN |
          (api.motionContext == MotionContext.TRANSLATING |
            api.motionContext == MotionContext.LANDING_CONTEXT) &
            api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE ___>:
          api.awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS,
        // guarantee INITIAL_AWARENESS_CONDITION_stationary_loss
        api.motionContext == MotionContext.STATIONARY &
          api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE ___>:
          api.awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR)
  }

  def finalise(api: AwarenessConditionOwner_Operational_Api): Unit = { }

  def timeTriggered(api: AwarenessConditionOwner_Operational_Api): Unit = {
    val m: MotionContext.Type = api.get_motionContext().get
    val o: ObstacleAssessment.Type = api.get_obstacleAssessment().get
    if (m == MotionContext.UNKNOWN) {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_AWARENESS_LOSS)
    } else if (o == ObstacleAssessment.NO_INDICATION) {
      api.put_awarenessCondition(AwarenessCondition.AWARENESS_CLEAR)
    } else if (o == ObstacleAssessment.INDICATED & m == MotionContext.STATIONARY) {
      api.put_awarenessCondition(AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)
    } else if (o == ObstacleAssessment.INDICATED) {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT)
    } else if (m == MotionContext.STATIONARY) {
      api.put_awarenessCondition(AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)
    } else {
      api.put_awarenessCondition(AwarenessCondition.ACTIVE_AWARENESS_LOSS)
    }
  }
}
