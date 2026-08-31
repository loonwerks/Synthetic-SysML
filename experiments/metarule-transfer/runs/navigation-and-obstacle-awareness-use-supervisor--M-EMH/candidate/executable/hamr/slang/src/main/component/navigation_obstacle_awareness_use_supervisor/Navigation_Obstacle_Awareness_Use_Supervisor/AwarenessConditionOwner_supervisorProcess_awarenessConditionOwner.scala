// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner {

  def initialise(api: AwarenessConditionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_awarenessCondition(Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR)
  }

  def timeTriggered(api: AwarenessConditionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_motionContext: Option[Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type] = api.get_motionContext()
    api.logInfo(s"Received on data port motionContext: ${apiUsage_motionContext}")
    val apiUsage_obstacleAssessment: Option[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type] = api.get_obstacleAssessment()
    api.logInfo(s"Received on data port obstacleAssessment: ${apiUsage_obstacleAssessment}")
  }

  def finalise(api: AwarenessConditionOwner_Operational_Api): Unit = { }
}
