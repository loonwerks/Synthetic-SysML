// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier {

  def initialise(api: BarometricEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_barometricAssessment(EvidenceAssessment.REJECTED)
  }

  def timeTriggered(api: BarometricEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
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
    val evidence: NavigationEvidence.Type = api.get_barometricEvidence() match {
      case Some(value) => value
      case _ => NavigationEvidence.INVALID
    }
    val assessment: EvidenceAssessment.Type =
      if (evidence == NavigationEvidence.NOMINAL_CURRENT) EvidenceAssessment.READY
      else if (evidence == NavigationEvidence.DEGRADED_CURRENT) EvidenceAssessment.LIMITED
      else EvidenceAssessment.REJECTED
    api.put_barometricAssessment(assessment)
  }

  def finalise(api: BarometricEvidenceQualifier_Operational_Api): Unit = { }
}
