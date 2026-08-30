// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier {

  def initialise(api: ObstacleEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_OBSTACLE_ASSESSMENT_none
        api.obstacleEvidence == ObstacleEvidence.NO_INDICATION_CURRENT ___>:
          api.obstacleAssessment == ObstacleAssessment.NO_INDICATION,
        // guarantee INITIAL_OBSTACLE_ASSESSMENT_indicated
        api.obstacleEvidence == ObstacleEvidence.INDICATION_CURRENT ___>:
          api.obstacleAssessment == ObstacleAssessment.INDICATED,
        // guarantee INITIAL_OBSTACLE_ASSESSMENT_unavailable
        api.obstacleEvidence == ObstacleEvidence.UNAVAILABLE_CURRENT |
          api.obstacleEvidence == ObstacleEvidence.STALE |
          api.obstacleEvidence == ObstacleEvidence.INVALID ___>:
          api.obstacleAssessment == ObstacleAssessment.UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_obstacleAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION)
  }

  def finalise(api: ObstacleEvidenceQualifier_Operational_Api): Unit = { }

  def timeTriggered(api: ObstacleEvidenceQualifier_Operational_Api): Unit = {
    api.get_obstacleEvidence() match {
      case Some(ObstacleEvidence.NO_INDICATION_CURRENT) => api.put_obstacleAssessment(ObstacleAssessment.NO_INDICATION)
      case Some(ObstacleEvidence.INDICATION_CURRENT) => api.put_obstacleAssessment(ObstacleAssessment.INDICATED)
      case _ => api.put_obstacleAssessment(ObstacleAssessment.UNAVAILABLE)
    }
  }
}
