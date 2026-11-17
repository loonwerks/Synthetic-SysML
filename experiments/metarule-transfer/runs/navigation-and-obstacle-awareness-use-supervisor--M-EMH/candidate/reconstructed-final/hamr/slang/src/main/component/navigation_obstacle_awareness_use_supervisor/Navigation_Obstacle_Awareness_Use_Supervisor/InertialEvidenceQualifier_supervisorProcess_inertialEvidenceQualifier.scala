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
    val evidence: NavigationEvidence.Type = api.get_inertialEvidence() match {
      case Some(value) => value
      case _ => NavigationEvidence.INVALID
    }
    val assessment: EvidenceAssessment.Type =
      if (evidence == NavigationEvidence.NOMINAL_CURRENT) EvidenceAssessment.READY
      else if (evidence == NavigationEvidence.DEGRADED_CURRENT) EvidenceAssessment.LIMITED
      else EvidenceAssessment.REJECTED
    api.put_inertialAssessment(assessment)
  }

  def finalise(api: InertialEvidenceQualifier_Operational_Api): Unit = { }
}
