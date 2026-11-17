// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier {

  def initialise(api: GpsEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: GpsEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_GPS_CLASSIFICATION
        //   Qualify current GPS evidence
        (api.gpsEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.gpsAssessment == EvidenceAssessment.READY) &
          (api.gpsEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
            api.gpsAssessment == EvidenceAssessment.LIMITED) &
          (api.gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            api.gpsEvidence == NavigationEvidence.STALE |
            api.gpsEvidence == NavigationEvidence.INVALID ___>:
            api.gpsAssessment == EvidenceAssessment.REJECTED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_gpsEvidence() match {
      case Some(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.NOMINAL_CURRENT) =>
        api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
      case Some(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.DEGRADED_CURRENT) =>
        api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)
      case _ =>
        api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)
    }
  }

  def finalise(api: GpsEvidenceQualifier_Operational_Api): Unit = { }
}
