// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier {

  def initialise(api: ObstacleEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: ObstacleEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_OBSTACLE_CLASSIFICATION
        //   Qualify current obstacle evidence
        (api.obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT ___>:
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION) &
          (api.obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT ___>:
            api.obstacleAssessment == ObstacleAssessment.INDICATED) &
          (api.obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT |
            api.obstacleEvidence == ObstacleEvidence.STALE |
            api.obstacleEvidence == ObstacleEvidence.INVALID ___>:
            api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_obstacleEvidence() match {
      case Some(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.NO_INDICATION_CURRENT) =>
        api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION)
      case Some(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.INDICATION_CURRENT) =>
        api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.INDICATED)
      case _ =>
        api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.UNAVAILABLE)
    }
  }

  def finalise(api: ObstacleEvidenceQualifier_Operational_Api): Unit = { }
}
