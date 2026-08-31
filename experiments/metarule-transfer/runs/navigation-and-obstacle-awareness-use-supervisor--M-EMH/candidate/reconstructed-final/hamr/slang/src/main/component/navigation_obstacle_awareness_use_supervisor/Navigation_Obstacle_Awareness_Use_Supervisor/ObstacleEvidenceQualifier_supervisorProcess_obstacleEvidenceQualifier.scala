// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier {

  def initialise(api: ObstacleEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_obstacleAssessment(ObstacleAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: ObstacleEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_OBSTACLE_CLASSIFICATION
        (T) ___>: ((api.obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT ___>:
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION) &
          (api.obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT ___>:
            api.obstacleAssessment == ObstacleAssessment.INDICATED) &
          (api.obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT |
            api.obstacleEvidence == ObstacleEvidence.STALE |
            api.obstacleEvidence == ObstacleEvidence.INVALID ___>:
            api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence: ObstacleEvidence.Type = api.get_obstacleEvidence() match {
      case Some(value) => value
      case _ => ObstacleEvidence.INVALID
    }
    val assessment: ObstacleAssessment.Type =
      if (evidence == ObstacleEvidence.NO_INDICATION_CURRENT) ObstacleAssessment.NO_INDICATION
      else if (evidence == ObstacleEvidence.INDICATION_CURRENT) ObstacleAssessment.INDICATED
      else ObstacleAssessment.UNAVAILABLE
    api.put_obstacleAssessment(assessment)
  }

  def finalise(api: ObstacleEvidenceQualifier_Operational_Api): Unit = { }
}
