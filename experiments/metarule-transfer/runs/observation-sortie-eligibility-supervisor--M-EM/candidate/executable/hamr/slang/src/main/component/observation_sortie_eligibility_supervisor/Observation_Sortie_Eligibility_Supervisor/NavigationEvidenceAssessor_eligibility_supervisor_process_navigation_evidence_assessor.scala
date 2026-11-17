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
    val evidence: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = api.get_navigation_evidence().get
    val result: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment =
          if (evidence.validity != Observation_Sortie_Eligibility_Supervisor.Validity.Valid) {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Invalid)
          } else if (evidence.freshness != Observation_Sortie_Eligibility_Supervisor.Freshness.Current) {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Stale)
          } else if (evidence.gpsCondition != Observation_Sortie_Eligibility_Supervisor.GpsCondition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Gps)
          } else if (evidence.inertial != Observation_Sortie_Eligibility_Supervisor.InertialCondition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Inertial)
          } else if (evidence.barometric != Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(F, Observation_Sortie_Eligibility_Supervisor.NavigationCause.Barometric)
          } else {
            Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(T, Observation_Sortie_Eligibility_Supervisor.NavigationCause.None)
          }
    api.put_navigation_assessment(result)
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
