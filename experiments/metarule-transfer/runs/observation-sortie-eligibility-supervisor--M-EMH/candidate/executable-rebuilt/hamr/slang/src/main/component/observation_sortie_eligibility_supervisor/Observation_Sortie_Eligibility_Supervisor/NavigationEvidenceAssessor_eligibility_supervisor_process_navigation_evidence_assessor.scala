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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case NAVIGATION_READY
        (api.navigation_evidence.validity == Validity.Valid &
          api.navigation_evidence.freshness == Freshness.Current &
          api.navigation_evidence.gpsCondition == GpsCondition.Nominal &
          api.navigation_evidence.inertial == InertialCondition.Nominal &
          api.navigation_evidence.barometric == BarometricCondition.Nominal) ___>: (api.navigation_assessment.ready &
          api.navigation_assessment.localCause == NavigationCause.None),
        // case NAVIGATION_INVALID
        (api.navigation_evidence.validity == Validity.Invalid) ___>: (!(api.navigation_assessment.ready) &
          api.navigation_assessment.localCause == NavigationCause.Invalid),
        // case NAVIGATION_STALE
        (api.navigation_evidence.validity == Validity.Valid &
          api.navigation_evidence.freshness == Freshness.Stale) ___>: (!(api.navigation_assessment.ready) &
          api.navigation_assessment.localCause == NavigationCause.Stale),
        // case NAVIGATION_GPS
        (api.navigation_evidence.validity == Validity.Valid &
          api.navigation_evidence.freshness == Freshness.Current &
          api.navigation_evidence.gpsCondition != GpsCondition.Nominal) ___>: (!(api.navigation_assessment.ready) &
          api.navigation_assessment.localCause == NavigationCause.Gps),
        // case NAVIGATION_INERTIAL
        (api.navigation_evidence.validity == Validity.Valid &
          api.navigation_evidence.freshness == Freshness.Current &
          api.navigation_evidence.gpsCondition == GpsCondition.Nominal &
          api.navigation_evidence.inertial != InertialCondition.Nominal) ___>: (!(api.navigation_assessment.ready) &
          api.navigation_assessment.localCause == NavigationCause.Inertial),
        // case NAVIGATION_BAROMETRIC
        (api.navigation_evidence.validity == Validity.Valid &
          api.navigation_evidence.freshness == Freshness.Current &
          api.navigation_evidence.gpsCondition == GpsCondition.Nominal &
          api.navigation_evidence.inertial == InertialCondition.Nominal &
          api.navigation_evidence.barometric != BarometricCondition.Nominal) ___>: (!(api.navigation_assessment.ready) &
          api.navigation_assessment.localCause == NavigationCause.Barometric)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_navigation_evidence().get
    val assessment: NavigationAssessment =
      if (evidence.validity == Validity.Invalid) NavigationAssessment(F, NavigationCause.Invalid)
      else if (evidence.freshness == Freshness.Stale) NavigationAssessment(F, NavigationCause.Stale)
      else if (evidence.gpsCondition != GpsCondition.Nominal) NavigationAssessment(F, NavigationCause.Gps)
      else if (evidence.inertial != InertialCondition.Nominal) NavigationAssessment(F, NavigationCause.Inertial)
      else if (evidence.barometric != BarometricCondition.Nominal) NavigationAssessment(F, NavigationCause.Barometric)
      else NavigationAssessment(T, NavigationCause.None)
    api.put_navigation_assessment(assessment)
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
