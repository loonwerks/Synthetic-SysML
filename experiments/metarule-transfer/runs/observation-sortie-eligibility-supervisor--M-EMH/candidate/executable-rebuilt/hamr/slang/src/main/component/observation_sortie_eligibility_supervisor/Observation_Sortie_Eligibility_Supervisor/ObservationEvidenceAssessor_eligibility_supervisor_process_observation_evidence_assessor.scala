// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor {

  def initialise(api: ObservationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_observation_assessment(SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: ObservationEvidenceAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case OBSERVATION_READY
        (api.observation_evidence.validity == Validity.Valid &
          api.observation_evidence.freshness == Freshness.Current &
          api.observation_evidence.condition == EquipmentCondition.Nominal) ___>: (api.observation_assessment.ready &
          api.observation_assessment.localCause == SingleEquipmentCause.None),
        // case OBSERVATION_INVALID
        (api.observation_evidence.validity == Validity.Invalid) ___>: (!(api.observation_assessment.ready) &
          api.observation_assessment.localCause == SingleEquipmentCause.Invalid),
        // case OBSERVATION_STALE
        (api.observation_evidence.validity == Validity.Valid &
          api.observation_evidence.freshness == Freshness.Stale) ___>: (!(api.observation_assessment.ready) &
          api.observation_assessment.localCause == SingleEquipmentCause.Stale),
        // case OBSERVATION_CONDITION
        (api.observation_evidence.validity == Validity.Valid &
          api.observation_evidence.freshness == Freshness.Current &
          api.observation_evidence.condition != EquipmentCondition.Nominal) ___>: (!(api.observation_assessment.ready) &
          api.observation_assessment.localCause == SingleEquipmentCause.Condition)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_observation_evidence().get
    val assessment: SingleEquipmentAssessment =
      if (evidence.validity == Validity.Invalid) SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
      else if (evidence.freshness == Freshness.Stale) SingleEquipmentAssessment(F, SingleEquipmentCause.Stale)
      else if (evidence.condition == EquipmentCondition.Nominal) SingleEquipmentAssessment(T, SingleEquipmentCause.None)
      else SingleEquipmentAssessment(F, SingleEquipmentCause.Condition)
    api.put_observation_assessment(assessment)
  }

  def finalise(api: ObservationEvidenceAssessor_Operational_Api): Unit = { }
}
