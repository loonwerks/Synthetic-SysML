// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor {

  def initialise(api: NavigationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_navigation_assessment(NavigationAssessment(F, NavigationCause.Invalid))
  }

  def timeTriggered(api: NavigationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: NavigationAssessment = api.get_navigation_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Validity.Valid) NavigationAssessment(F, NavigationCause.Invalid)
        else if (evidence.freshness != Freshness.Current) NavigationAssessment(F, NavigationCause.Stale)
        else if (evidence.gpsCondition != GpsCondition.Nominal) NavigationAssessment(F, NavigationCause.Gps)
        else if (evidence.inertial != InertialCondition.Nominal) NavigationAssessment(F, NavigationCause.Inertial)
        else if (evidence.barometric != BarometricCondition.Nominal) NavigationAssessment(F, NavigationCause.Barometric)
        else NavigationAssessment(T, NavigationCause.None)
      case _ => NavigationAssessment(F, NavigationCause.Invalid)
    }
    api.put_navigation_assessment(assessment)
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
