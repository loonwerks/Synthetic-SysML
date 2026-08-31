// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier {

  def initialise(api: GpsEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gpsAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: GpsEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_GPS_CLASSIFICATION
        (T) ___>: ((api.gpsEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.gpsAssessment == EvidenceAssessment.READY) &
          (api.gpsEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
            api.gpsAssessment == EvidenceAssessment.LIMITED) &
          (api.gpsEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            api.gpsEvidence == NavigationEvidence.STALE |
            api.gpsEvidence == NavigationEvidence.INVALID ___>:
            api.gpsAssessment == EvidenceAssessment.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_gpsEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] = api.get_gpsEvidence()
    api.logInfo(s"Received on data port gpsEvidence: ${apiUsage_gpsEvidence}")
  }

  def finalise(api: GpsEvidenceQualifier_Operational_Api): Unit = { }
}
