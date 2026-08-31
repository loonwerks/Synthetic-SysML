// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier {

  def initialise(api: ObstacleEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION)
  }

  def timeTriggered(api: ObstacleEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_obstacleEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type] = api.get_obstacleEvidence()
    api.logInfo(s"Received on data port obstacleEvidence: ${apiUsage_obstacleEvidence}")
  }

  def finalise(api: ObstacleEvidenceQualifier_Operational_Api): Unit = { }
}
