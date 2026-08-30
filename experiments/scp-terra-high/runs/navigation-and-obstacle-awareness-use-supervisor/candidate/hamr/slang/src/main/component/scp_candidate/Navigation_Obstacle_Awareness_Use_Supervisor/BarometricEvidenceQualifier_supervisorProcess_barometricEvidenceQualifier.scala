// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier {

  def initialise(api: BarometricEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_BAROMETRIC_ASSESSMENT_nominal
        api.barometricEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.barometricAssessment == EvidenceAssessment.READY,
        // guarantee INITIAL_BAROMETRIC_ASSESSMENT_degraded
        api.barometricEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
          api.barometricAssessment == EvidenceAssessment.LIMITED,
        // guarantee INITIAL_BAROMETRIC_ASSESSMENT_rejected
        api.barometricEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
          api.barometricEvidence == NavigationEvidence.STALE |
          api.barometricEvidence == NavigationEvidence.INVALID ___>:
          api.barometricAssessment == EvidenceAssessment.REJECTED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_barometricAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def finalise(api: BarometricEvidenceQualifier_Operational_Api): Unit = { }

  def timeTriggered(api: BarometricEvidenceQualifier_Operational_Api): Unit = {
    api.get_barometricEvidence() match {
      case Some(NavigationEvidence.NOMINAL_CURRENT) => api.put_barometricAssessment(EvidenceAssessment.READY)
      case Some(NavigationEvidence.DEGRADED_CURRENT) => api.put_barometricAssessment(EvidenceAssessment.LIMITED)
      case _ => api.put_barometricAssessment(EvidenceAssessment.REJECTED)
    }
  }
}
