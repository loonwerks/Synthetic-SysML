// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor {

  def initialise(api: NavigationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_navigation_assessment(Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
      F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Invalid))
  }

  def timeTriggered(api: NavigationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val input: Option[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord] = api.get_navigation_evidence()
    var result: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment =
      Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
        F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Invalid)
    input match {
      case Some(e) =>
        if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Valid &&
          e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Current &&
          e.gpsCondition == Observation_Sortie_Eligibility_Supervisor.GpsCondition.Nominal &&
          e.inertial == Observation_Sortie_Eligibility_Supervisor.InertialCondition.Nominal &&
          e.barometric == Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            T, Observation_Sortie_Eligibility_Supervisor.NavigationCause.None)
        } else if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Invalid) {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Invalid)
        } else if (e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Stale) {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Stale)
        } else if (e.gpsCondition != Observation_Sortie_Eligibility_Supervisor.GpsCondition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Gps)
        } else if (e.inertial != Observation_Sortie_Eligibility_Supervisor.InertialCondition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Inertial)
        } else {
          result = Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Barometric)
        }
      case _ =>
    }
    api.put_navigation_assessment(result)
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
