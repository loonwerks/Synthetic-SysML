// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor {

  def initialise(api: NavigationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_navigation_assessment(Observation_Sortie_Eligibility_Supervisor.NavigationAssessment.example())
  }

  def timeTriggered(api: NavigationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_navigation_evidence() match {
      case Some(e) =>
        val r: NavigationAssessment = if (e.validity != Validity.Valid) NavigationAssessment(F, NavigationCause.Invalid)
        else if (e.freshness != Freshness.Current) NavigationAssessment(F, NavigationCause.Stale)
        else if (e.gpsCondition != GpsCondition.Nominal) NavigationAssessment(F, NavigationCause.Gps)
        else if (e.inertial != InertialCondition.Nominal) NavigationAssessment(F, NavigationCause.Inertial)
        else if (e.barometric != BarometricCondition.Nominal) NavigationAssessment(F, NavigationCause.Barometric)
        else NavigationAssessment(T, NavigationCause.None)
        api.put_navigation_assessment(r)
    }
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
