// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier {

  def initialise(api: BarometricEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_barometricAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: BarometricEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_03_BAROMETRIC_CLASSIFICATION
        (T) ___>: ((api.barometricEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.barometricAssessment == EvidenceAssessment.READY) &
          (api.barometricEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
            api.barometricAssessment == EvidenceAssessment.LIMITED) &
          (api.barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
            api.barometricEvidence == NavigationEvidence.STALE |
            api.barometricEvidence == NavigationEvidence.INVALID ___>:
            api.barometricAssessment == EvidenceAssessment.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_barometricEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] = api.get_barometricEvidence()
    api.logInfo(s"Received on data port barometricEvidence: ${apiUsage_barometricEvidence}")
  }

  def finalise(api: BarometricEvidenceQualifier_Operational_Api): Unit = { }
}
