// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor {

  def initialise(api: PropulsionEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_propulsion_assessment(PropulsionAssessment(F, PropulsionCause.Invalid))
  }

  def timeTriggered(api: PropulsionEvidenceAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PROPULSION_READY
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
          api.propulsion_evidence.engine1 == Engine1Condition.Nominal &
          api.propulsion_evidence.engine2 == Engine2Condition.Nominal &
          api.propulsion_evidence.engine3 == Engine3Condition.Nominal &
          api.propulsion_evidence.engine4 == Engine4Condition.Nominal) ___>: (api.propulsion_assessment.ready &
          api.propulsion_assessment.localCause == PropulsionCause.None),
        // case PROPULSION_INVALID
        (api.propulsion_evidence.validity == Validity.Invalid) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Invalid),
        // case PROPULSION_STALE
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Stale) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Stale),
        // case PROPULSION_CONFIGURATION
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.NotConfirmed) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Configuration),
        // case PROPULSION_ENGINE1
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
          api.propulsion_evidence.engine1 != Engine1Condition.Nominal) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Engine1),
        // case PROPULSION_ENGINE2
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
          api.propulsion_evidence.engine1 == Engine1Condition.Nominal &
          api.propulsion_evidence.engine2 != Engine2Condition.Nominal) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Engine2),
        // case PROPULSION_ENGINE3
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
          api.propulsion_evidence.engine1 == Engine1Condition.Nominal &
          api.propulsion_evidence.engine2 == Engine2Condition.Nominal &
          api.propulsion_evidence.engine3 != Engine3Condition.Nominal) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Engine3),
        // case PROPULSION_ENGINE4
        (api.propulsion_evidence.validity == Validity.Valid &
          api.propulsion_evidence.freshness == Freshness.Current &
          api.propulsion_evidence.alternatingKindsConfirmed == Confirmation.Confirmed &
          api.propulsion_evidence.engine1 == Engine1Condition.Nominal &
          api.propulsion_evidence.engine2 == Engine2Condition.Nominal &
          api.propulsion_evidence.engine3 == Engine3Condition.Nominal &
          api.propulsion_evidence.engine4 != Engine4Condition.Nominal) ___>: (!(api.propulsion_assessment.ready) &
          api.propulsion_assessment.localCause == PropulsionCause.Engine4)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_propulsion_evidence().get
    val assessment: PropulsionAssessment =
      if (evidence.validity == Validity.Invalid) PropulsionAssessment(F, PropulsionCause.Invalid)
      else if (evidence.freshness == Freshness.Stale) PropulsionAssessment(F, PropulsionCause.Stale)
      else if (evidence.alternatingKindsConfirmed == Confirmation.NotConfirmed) PropulsionAssessment(F, PropulsionCause.Configuration)
      else if (evidence.engine1 != Engine1Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine1)
      else if (evidence.engine2 != Engine2Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine2)
      else if (evidence.engine3 != Engine3Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine3)
      else if (evidence.engine4 != Engine4Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine4)
      else PropulsionAssessment(T, PropulsionCause.None)
    api.put_propulsion_assessment(assessment)
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
