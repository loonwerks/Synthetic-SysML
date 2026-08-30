// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier {

  def initialise(api: InertialEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_INERTIAL_ASSESSMENT_nominal
        api.inertialEvidence == NavigationEvidence.NOMINAL_CURRENT ___>:
          api.inertialAssessment == EvidenceAssessment.READY,
        // guarantee INITIAL_INERTIAL_ASSESSMENT_degraded
        api.inertialEvidence == NavigationEvidence.DEGRADED_CURRENT ___>:
          api.inertialAssessment == EvidenceAssessment.LIMITED,
        // guarantee INITIAL_INERTIAL_ASSESSMENT_rejected
        api.inertialEvidence == NavigationEvidence.UNAVAILABLE_CURRENT |
          api.inertialEvidence == NavigationEvidence.STALE |
          api.inertialEvidence == NavigationEvidence.INVALID ___>:
          api.inertialAssessment == EvidenceAssessment.REJECTED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_inertialAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def finalise(api: InertialEvidenceQualifier_Operational_Api): Unit = { }

  def timeTriggered(api: InertialEvidenceQualifier_Operational_Api): Unit = {
    api.get_inertialEvidence() match {
      case Some(NavigationEvidence.NOMINAL_CURRENT) => api.put_inertialAssessment(EvidenceAssessment.READY)
      case Some(NavigationEvidence.DEGRADED_CURRENT) => api.put_inertialAssessment(EvidenceAssessment.LIMITED)
      case _ => api.put_inertialAssessment(EvidenceAssessment.REJECTED)
    }
  }
}
