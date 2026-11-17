// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier {

  def initialise(api: InertialEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_inertialAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: InertialEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_02_INERTIAL_CLASSIFICATION
        (T) ___>: ((api.inertialEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.inertialAssessment == EvidenceAssessment.READY) &
          (api.inertialEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
            api.inertialAssessment == EvidenceAssessment.LIMITED) &
          (api.inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            api.inertialEvidence == NavigationEvidence.STALE |
            api.inertialEvidence == NavigationEvidence.INVALID ___>:
            api.inertialAssessment == EvidenceAssessment.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_inertialEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] = api.get_inertialEvidence()
    api.logInfo(s"Received on data port inertialEvidence: ${apiUsage_inertialEvidence}")
  }

  def finalise(api: InertialEvidenceQualifier_Operational_Api): Unit = { }
}
