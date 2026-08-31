// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier {

  def initialise(api: InertialEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_inertialAssessment(EvidenceAssessment.REJECTED)
  }

  def timeTriggered(api: InertialEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
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
    api.get_inertialEvidence() match {
      case Some(NavigationEvidence.NOMINAL_CURRENT) =>
        api.put_inertialAssessment(EvidenceAssessment.READY)
      case Some(NavigationEvidence.DEGRADED_CURRENT) =>
        api.put_inertialAssessment(EvidenceAssessment.LIMITED)
      case _ =>
        api.put_inertialAssessment(EvidenceAssessment.REJECTED)
    }
  }

  def finalise(api: InertialEvidenceQualifier_Operational_Api): Unit = { }
}
