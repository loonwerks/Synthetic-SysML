// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier {

  def initialise(api: GpsEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.gpsAssessment == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY
      )
    )

    api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: GpsEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        (api.gpsEvidence == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.NOMINAL_CURRENT).
          implies(api.gpsAssessment == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
        & (api.gpsEvidence == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.DEGRADED_CURRENT).
          implies(api.gpsAssessment == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)
        & ((api.gpsEvidence == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.UNAVAILABLE_CURRENT)
          | (api.gpsEvidence == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.STALE)
          | (api.gpsEvidence == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.INVALID)).
          implies(api.gpsAssessment == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)
      )
    )

    val apiUsage_gpsEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] = api.get_gpsEvidence()

    apiUsage_gpsEvidence match {
      case Some(v) =>
        if (v == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.NOMINAL_CURRENT) {
          api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
        } else if (v == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.DEGRADED_CURRENT) {
          api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED)
        } else {
          api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)
        }
      case None =>
        api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
    }
  }

  def finalise(api: GpsEvidenceQualifier_Operational_Api): Unit = { }
}
