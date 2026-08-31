// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor {

  def initialise(api: ObstacleEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_obstacle_assessment(SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: ObstacleEvidenceAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case OBSTACLE_READY
        (api.obstacle_evidence.validity == Validity.Valid &
          api.obstacle_evidence.freshness == Freshness.Current &
          api.obstacle_evidence.condition == EquipmentCondition.Nominal) ___>: (api.obstacle_assessment.ready &
          api.obstacle_assessment.localCause == SingleEquipmentCause.None),
        // case OBSTACLE_INVALID
        (api.obstacle_evidence.validity == Validity.Invalid) ___>: (!(api.obstacle_assessment.ready) &
          api.obstacle_assessment.localCause == SingleEquipmentCause.Invalid),
        // case OBSTACLE_STALE
        (api.obstacle_evidence.validity == Validity.Valid &
          api.obstacle_evidence.freshness == Freshness.Stale) ___>: (!(api.obstacle_assessment.ready) &
          api.obstacle_assessment.localCause == SingleEquipmentCause.Stale),
        // case OBSTACLE_CONDITION
        (api.obstacle_evidence.validity == Validity.Valid &
          api.obstacle_evidence.freshness == Freshness.Current &
          api.obstacle_evidence.condition != EquipmentCondition.Nominal) ___>: (!(api.obstacle_assessment.ready) &
          api.obstacle_assessment.localCause == SingleEquipmentCause.Condition)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_obstacle_evidence().get
    val assessment: SingleEquipmentAssessment =
      if (evidence.validity == Validity.Invalid) SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
      else if (evidence.freshness == Freshness.Stale) SingleEquipmentAssessment(F, SingleEquipmentCause.Stale)
      else if (evidence.condition == EquipmentCondition.Nominal) SingleEquipmentAssessment(T, SingleEquipmentCause.None)
      else SingleEquipmentAssessment(F, SingleEquipmentCause.Condition)
    api.put_obstacle_assessment(assessment)
  }

  def finalise(api: ObstacleEvidenceAssessor_Operational_Api): Unit = { }
}
